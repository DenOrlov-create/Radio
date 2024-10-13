import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    //Тесты переключения станций//
    @Test
    public void turnOnRandomStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(7);
        int expected = 7;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void firstStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);
        int expected = 1;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lastStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    //Тесты переключения громкости//
    @Test
    public void turnOnRandomVolume() {
        Radio radio = new Radio();
        radio.setVolume(15);
        int expected = 15;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveVolume() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

}
