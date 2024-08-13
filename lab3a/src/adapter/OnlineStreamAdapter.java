package adapter;

public class OnlineStreamAdapter implements MusicPlayer {
    private OnlineStreamPlayer onlineStreamPlayer;

    public OnlineStreamAdapter(OnlineStreamPlayer onlineStreamPlayer) {
        this.onlineStreamPlayer = onlineStreamPlayer;
    }

    @Override
    public void play(String file) {
        onlineStreamPlayer.playOnlineStream(file);
    }
}


