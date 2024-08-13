package lab3b;

public class VolumeControlDecorator extends MusicPlayerDecorator {
    public VolumeControlDecorator(Playback decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void setVolume(int volume) {
        // Additional logic for volume control
        super.setVolume(volume);
    }
} 


