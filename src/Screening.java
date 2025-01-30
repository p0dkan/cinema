import java.util.ArrayList;
import java.util.List;

public class Screening {
    private Movie movie;
    private String dateTime;
    private List<String> availableSeats = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();

    public Screening(Movie movie, String dateTime, List<String> seats) {
        this.movie = movie;
        this.dateTime = dateTime;
        this.availableSeats.addAll(seats);
    }

    public String getScreening() {
        return "Screening of " + movie.getTitle() + " at " + dateTime;
    }

    public void reservePlaces(String... seats) {
        for (String seat : seats) {
            if (availableSeats.contains(seat)) {
                availableSeats.remove(seat);
                tickets.add(new Ticket(null, seat));
                System.out.println("Reserved seat: " + seat);
            } else {
                System.out.println("Seat " + seat + " is not available.");
            }
        }
    }

    public void reservePlaces(Customer customer, String... seats) {
        for (String seat : seats) {
            if (availableSeats.contains(seat)) {
                availableSeats.remove(seat);
                tickets.add(new Ticket(customer, seat));
                System.out.println("Reserved seat: " + seat + " for customer: " + customer.getName());
            } else {
                System.out.println("Seat " + seat + " is not available.");
            }
        }
    }

}

