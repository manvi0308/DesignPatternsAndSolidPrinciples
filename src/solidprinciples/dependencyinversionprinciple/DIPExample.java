package solidprinciples.dependencyinversionprinciple;

interface PaymentMethod{
	void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
	public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
	}
}

class PayPalPayment implements PaymentMethod{
	public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Paypal.");
	}
}

class OrderPlacement{
	private PaymentMethod paymentMethod;
	public OrderPlacement(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void processOrder(double amount) {
		paymentMethod.pay(amount);
	}
}
public class DIPExample {
	public static void main(String[] args) {
		PaymentMethod creditcard = new CreditCardPayment();
		PaymentMethod paypal = new PayPalPayment();
		
		OrderPlacement order1 = new OrderPlacement(creditcard);
		order1.processOrder(1000);
		
		OrderPlacement order2 = new OrderPlacement(paypal);
		order2.processOrder(2000);
	}
}
