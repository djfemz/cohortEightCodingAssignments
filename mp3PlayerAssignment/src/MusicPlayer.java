public class MusicPlayer {
    private boolean isOn;
    private boolean isPlaying;
    private int track;

    public void startUp() {
        if (!isOn) {
            this.isOn = true;
        }else
        if (isOn) {
            this.isOn=false;
        }
    }

    public boolean isOn() {
        return this.isOn;
    }

   /* public void turnMusicPlayerOff() {
        this.isOn = false;
    }

    */

    public void play() {
        if (this.isPlaying==false&&track==0) {
            isPlaying = true;
            track = 1;
        }
        isPlaying=true;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public void next() {
        track++;
    }

    public int getTrack() {
        return track;
    }

    public void previous() {
        if (track>1) {
            track--;
        }
    }

    public void stop() {
        this.track = 0;
        this.isPlaying = false;
    }

    public void pause() {
        if (this.isPlaying==true&&track>0) {
            this.isPlaying = false;
        }
    }
}
