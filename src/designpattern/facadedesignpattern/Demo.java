package designpattern.facadedesignpattern;

public class Demo {
    public static void main(String[] args) {
        /*
            Create a User --> User.java
            Check if ticket is available --> TicketSystem
            Make the payment ---> PaymentSystem
            Notify the user ---> NotificationSystem
         */
        User user = new User("Manvi", "ifiuwhfwuhf9wf*gmail.com");
        BookingFacade facade = new BookingFacade();
        facade.makeBooking("ABCD", user);
    }
}
