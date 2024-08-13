package adapter;

public class Main {
	public static void main(String[] args) {
        // Create instances of different music players
        MusicPlayer localFilePlayer = new LocalFileAdapter(new LocalFilePlayer());
        MusicPlayer onlineStreamPlayer = new OnlineStreamAdapter(new OnlineStreamPlayer());
        MusicPlayer radioPlayer = new RadioAdapter(new RadioPlayer());

        // Decorate with equalizer and volume control
        MusicPlayer localFileWithEffects = new EqualizerDecorator(new VolumeControlDecorator(localFilePlayer));
        MusicPlayer onlineStreamWithEffects = new EqualizerDecorator(new VolumeControlDecorator(onlineStreamPlayer));
        MusicPlayer radioWithEffects = new EqualizerDecorator(new VolumeControlDecorator(radioPlayer));

        // Play music using different sources with decorators
        System.out.println("Playing with local file player:");
        localFileWithEffects.play("song.mp3");

        System.out.println("\nPlaying with online stream player:");
        onlineStreamWithEffects.play("http://example.com/stream");

        System.out.println("\nPlaying with radio player:");
        radioWithEffects.play("Rock Station");
    }

}
