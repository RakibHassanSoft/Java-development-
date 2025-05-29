/*
 24. Make a BusRoute class with route number, distance, and duration. Store routes in an array and sort them by shortest time.
 */

package Third10;

public class BusRoute {
    int routeNumber;
    double distance;
    double duration; // in minutes

    BusRoute(int number, double dist, double dur) {
        routeNumber = number;
        distance = dist;
        duration = dur;
    }
}
