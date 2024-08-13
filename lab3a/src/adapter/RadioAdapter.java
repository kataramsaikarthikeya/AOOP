package adapter;

public class RadioAdapter implements MusicPlayer {
    private RadioPlayer radioPlayer;

    public RadioAdapter(RadioPlayer radioPlayer) {
        this.radioPlayer = radioPlayer;
    }

    @Override
    public void play(String file) {
        radioPlayer.playRadioStation(file);
    }
}


