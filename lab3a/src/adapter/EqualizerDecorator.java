package adapter;

public class EqualizerDecorator extends MusicPlayerDecorator {

    public EqualizerDecorator(MusicPlayer decoratedMusicPlayer) {
        super(decoratedMusicPlayer);
    }

    @Override
    public void play(String file) {
        super.play(file);
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("Applying equalizer settings...");
    }
}


