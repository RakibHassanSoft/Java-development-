/*
 28. Create a Flight class with attributes: flightNo, destination, and fare. From an array of flights, display the cheapest flight to a specific destination (user input).
 */
package Third10;

public class Flight {
    String flightNo;
    String destination;
    double fare;

    Flight(String flightNo, String destination, double fare) {
        this.flightNo = flightNo;
        this.destination = destination;
        this.fare = fare;
    }
}
