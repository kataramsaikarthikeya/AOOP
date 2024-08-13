package lab3b;

public class MusicStreamingApp {
	public static void main(String[] args) {
        // Create music sources
        MusicSource localFileSource = new LocalFileMusicSource("path/to/local/file.mp3");
        MusicSource onlineStreamSource = new OnlineStreamMusicSource("http://streaming.url");
        MusicSource radioStationSource = new RadioStationMusicSource("http://radio.station");

        // Create music players
        Playback localFilePlayer = new MusicPlayer(localFileSource);
        Playback onlineStreamPlayer = new MusicPlayer(onlineStreamSource);
        Playback radioStationPlayer = new MusicPlayer(radioStationSource);

        // Add decorators
        Playback equalizedLocalFilePlayer = new EqualizerDecorator(localFilePlayer);
        Playback volumeControlledOnlineStreamPlayer = new VolumeControlDecorator(onlineStreamPlayer);
        
        // Use the players
        equalizedLocalFilePlayer.play();
        volumeControlledOnlineStreamPlayer.setVolume(10);
        radioStationPlayer.play();
    }
}


