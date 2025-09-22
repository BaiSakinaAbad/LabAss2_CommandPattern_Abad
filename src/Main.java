import commands.*;
import devices.*;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        Light light = new Light();
        MusicPlayer music = new MusicPlayer();
        Aircon aircon = new Aircon();

        // Example usage
        hub.setCommand(new TurnOnCommand(light));
        hub.pressButton();

        hub.setCommand(new SetBrightnessCommand(light, 80));
        hub.pressButton();

        hub.setCommand(new TurnOnCommand(music));
        hub.pressButton();

        hub.setCommand(new TurnOnCommand(aircon));
        hub.pressButton();

        hub.setCommand(new SetTemperatureCommand(aircon, 20));
        hub.pressButton();
    }

}