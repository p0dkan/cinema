import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<Movie> movies = new ArrayList<>();
    private List<Screening> screenings = new ArrayList<>();

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public void printProgramme() {
        System.out.println("Cinema: " + name + ", Address: " + address);
        System.out.println("Programme for the next week:");
        for (Screening screening : screenings) {
            System.out.println(screening.getScreening());
        }
    }


    public void findMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().contains(title)) {
                System.out.println("Movie found");
                return;
            }
        }
        System.out.println("Movie not found");
    }
}