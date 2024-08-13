package lab3b;

public class LocalFileMusicSource implements MusicSource {
    private String filePath;

    public LocalFileMusicSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() {
        // Logic to play local file
    }

    @Override
    public void pause() {
        // Logic to pause local file
    }

    @Override
    public void stop() {
        // Logic to stop local file
    }

    @Override
    public void setVolume(int volume) {
        // Logic to set volume for local file
    }
}


