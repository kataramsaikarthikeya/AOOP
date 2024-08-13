package adapter;

public class LocalFileAdapter implements MusicPlayer {
    private LocalFilePlayer localFilePlayer;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

    @Override
    public void play(String file) {
        localFilePlayer.playLocalFile(file);
    }
}  


