package designpattern.facadedesignpattern;

public class BookingFacade {
    TicketSystem ts = new TicketSystem();
    PaymentSystem ps = new PaymentSystem();
    NotificationSystem ns = new NotificationSystem();
    public void makeBooking(String movie, User user){
        ts.makeBooking(movie);
        ps.pay();
        ns.notifyUser();
    }
}
