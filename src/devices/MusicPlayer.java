package devices;

public class MusicPlayer implements Device {
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
}
