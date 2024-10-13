public class Radio {
    private int radioStationNumber;
    private int volume;

    public void nextStation() {
        if (radioStationNumber != 9) {
            radioStationNumber++;
        } else {
            radioStationNumber = 0;
        }
    }

    public void prevStation() {
        if (radioStationNumber != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = 9;
        }
    }

    public void nextVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }


    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber < 0) {
            return;
        }
        if (radioStationNumber > 9) {
            return;
        }
        this.radioStationNumber = radioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 100) {
            return;
        }
        this.volume = volume;
    }
}
