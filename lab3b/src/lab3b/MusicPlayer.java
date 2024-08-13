package lab3b;

public class MusicPlayer implements Playback {
    private MusicSource source;

    public MusicPlayer(MusicSource source) {
        this.source = source;
    }

    @Override
    public void play() {
        source.play();
    }

    @Override
    public void pause() {
        source.pause();
    }

    @Override
    public void stop() {
        source.stop();
    }

    @Override
    public void setVolume(int volume) {
        source.setVolume(volume);
    }
} 


