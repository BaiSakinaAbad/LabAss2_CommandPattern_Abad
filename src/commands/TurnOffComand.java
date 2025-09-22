package commands;

import devices.Device;

public class TurnOffComand implements Command{
    private Device device;

    public void TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
