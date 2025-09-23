package devices;

public class Aircon implements Device{
    private int temperature = 24; //default

    @Override
    public void turnOn() {
        System.out.println("Aircon ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Aircon OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Aircon temperature set to " + temperature + "°C");
    }
}
