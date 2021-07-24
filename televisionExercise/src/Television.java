public class Television {
    private boolean isOn;
    private int channel=1;
    private int volume;

    public void turnTelevisionOn() {
        this.isOn = true;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void turnTelevisionOff() {
        this.isOn = false;
    }

    public void changeChannelUpwards() {
        if (channel>0&& channel<99){
            channel++;
        }
    }

    public int getTelevisionChannel() {
        return channel;
    }

    public void changeChannelDownwards() {
        if (channel>1) {
            channel--;
        }
    }

    public void setTelevisionChannel(int channelInput) {
        this.channel = channelInput;
    }

    public int getTelevisionVolume() {
        return volume;
    }

    public void increaseTelevisionVolume() {
        if (volume<=99) {
            volume++;
        }
    }

    public void decreaseTelevisionVolume() {
        volume--;
    }
}
