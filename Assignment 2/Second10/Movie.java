package Second10;

public class Movie {
    String name;
    double rating;

    Movie(String n, double r) {
        name = n;
        rating = r;
    }

    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Avater", 8.8),
            new Movie("Avater 2", 9.0),
            new Movie("Avater 3", 7.9)
        };

        Movie highest = movies[0];
        for (Movie m : movies) {
            if (m.rating > highest.rating) {
                highest = m;
            }
        }

        System.out.println("Highest rated movie: " + highest.name + " (" + highest.rating + ")");
    }
}

