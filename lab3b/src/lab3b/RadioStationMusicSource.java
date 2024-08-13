package lab3b;

public class RadioStationMusicSource implements MusicSource {
    private String stationUrl;

    public RadioStationMusicSource(String stationUrl) {
        this.stationUrl = stationUrl;
    }

    @Override
    public void play() {
        // Logic to play radio station
    }

    @Override
    public void pause() {
        // Logic to pause radio station
    }

    @Override
    public void stop() {
        // Logic to stop radio station
    }

    @Override
    public void setVolume(int volume) {
        // Logic to set volume for radio station
    }
} 


