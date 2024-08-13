package lab3b;

public class MusicPlayerDecorator implements Playback {
    protected Playback decoratedPlayer;

    public MusicPlayerDecorator(Playback decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    @Override
    public void play() {
        decoratedPlayer.play();
    }

    @Override
    public void pause() {
        decoratedPlayer.pause();
    }

    @Override
    public void stop() {
        decoratedPlayer.stop();
    }

    @Override
    public void setVolume(int volume) {
        decoratedPlayer.setVolume(volume);
    }
}



