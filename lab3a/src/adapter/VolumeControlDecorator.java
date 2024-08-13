package adapter;

public class VolumeControlDecorator extends MusicPlayerDecorator {

    public VolumeControlDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void play(String file) {
        super.play(file);
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting volume...");
    }
} 


