package commands;
import devices.MusicPlayer;

public class ChangeVolumeCommand implements Command {
    private MusicPlayer musicPlayer;
    private int step; // +1 for increase, -1 for decrease

    public ChangeVolumeCommand(MusicPlayer musicPlayer, int step) {
        this.musicPlayer = musicPlayer;
        this.step = step;
    }

    @Override
    public void execute() {
        if (step > 0) {
            musicPlayer.volumeUp();
        } else {
            musicPlayer.volumeDown();
        }
    }

}
