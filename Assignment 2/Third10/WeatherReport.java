/*

29. Create a WeatherReport class with city, temperature, and humidity. Store 5 reports and find the most humid city.

*/

package Third10;

public class WeatherReport {
    String city;
    double temperature;
    double humidity;

    WeatherReport(String city, double temp, double hum) {
        this.city = city;
        this.temperature = temp;
        this.humidity = hum;
    }
}
