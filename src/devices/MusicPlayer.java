package devices;

public class MusicPlayer implements Device {
    private int volume = 80; // default volume

    @Override
    public void turnOn() {
        System.out.println("Music Player ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Music Player OFF");
    }

    public void play(String playlist) {
        System.out.println("Playing playlist: " + playlist);
    }

    public void volumeUp() {
        volume++;
        System.out.println("Music volume increased to " + volume + "%");
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
        System.out.println("Music volume decreased to " + volume + "%");
    }
}
