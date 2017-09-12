package behavioral.observer;

public class WeatherObserver implements Observer {
    private int pressure;
    private int temperature;

    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature) {
        this.pressure = pressure;
        this.temperature = temperature;
        showData();
    }

    private void showData() {
        System.out.println("Pressure: " + pressure + ", Temperature: " + temperature);
    }
}
