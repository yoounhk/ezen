package src.Ex11;

public class MyTv2 {
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    private boolean isPowerOn;
    private int channel;
    private int prevCh;
    private int volume;

    public void setChannel(int channel) {
        prevCh = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void gotoPrevChannel() {
        setChannel(prevCh);
    }
}
