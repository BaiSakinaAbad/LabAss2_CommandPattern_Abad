package devices;

public class Light implements Device {
    private int brightness = 50;

    @Override
    public void turnOn() {
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned OFF");
    }

    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println("Light brightness set to " + level + "%");
    }
}
