package commands;

import devices.Light;

public class SetBrightnessCommand implements Command {
    private Light light;
    private int level;

    public SetBrightnessCommand(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        light.setBrightness(level);
    }
}
