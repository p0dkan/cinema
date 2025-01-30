import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");

        Movie movie1 = new Movie("James Bond", false, true);
        Movie movie2 = new Movie("Johnny English", true, false);

        cinema1.addMovie(movie1);
        cinema1.addMovie(movie2);

        List<String> seats = List.of("A1", "A2", "A3", "B1", "B2", "B3");
        Screening screening1 = new Screening(movie1, "2025-01-29 18:00", seats);
        Screening screening2 = new Screening(movie2, "2025-01-30 20:00", seats);

        cinema1.addScreening(screening1);
        cinema1.addScreening(screening2);

        cinema1.printProgramme();
        cinema1.findMovie("James Bond");

        Customer customer = new Customer("Jan Kowalski");
        screening1.reservePlaces("A1", "A2");
        screening2.reservePlaces(customer, "B1", "B2");
    }
}