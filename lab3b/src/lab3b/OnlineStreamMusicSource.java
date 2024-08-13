package lab3b;

public class OnlineStreamMusicSource implements MusicSource {
    private String streamUrl;

    public OnlineStreamMusicSource(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    @Override
    public void play() {
        // Logic to play online stream
    }

    @Override
    public void pause() {
        // Logic to pause online stream
    }

    @Override
    public void stop() {
        // Logic to stop online stream
    }

    @Override
    public void setVolume(int volume) {
        // Logic to set volume for online stream
    }
}


