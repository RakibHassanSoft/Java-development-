package Second10;
import java.util.Arrays;
import java.util.Comparator;

public class City {
    String name;
    int population;

    City(String n, int p) {
        name = n;
        population = p;
    }

    public static void main(String[] args) {
        City[] cities = {
            new City("Dhaka", 21000000),
            new City("Chittagong", 8000000),
            new City("Khulna", 1500000)
        };

        Arrays.sort(cities, Comparator.comparingInt(c -> c.population));

        System.out.println("Cities sorted by population:");
        for (City c : cities) {
            System.out.println(c.name + ": " + c.population);
        }
    }
}
