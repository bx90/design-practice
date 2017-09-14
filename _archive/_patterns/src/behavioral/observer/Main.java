package behavioral.observer;

/**
 * Defines a one to many dependency -> if one object changes, all of its dependencies should be notified automatically.
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setPressure(100);
        station.setTemperature(200);
    }
}
