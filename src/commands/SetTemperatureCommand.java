package commands;

import devices.Aircon;

public class SetTemperatureCommand implements Command{
    private Aircon aircon;
    private int temperature;

    public SetTemperatureCommand(Aircon aircon, int temperature) {
        this.aircon = aircon;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        aircon.setTemperature(temperature);
    }
}
