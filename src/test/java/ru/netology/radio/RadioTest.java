package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio ();

    @Test
    public void shouldShowNumberOfInstalledStations() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(30, radio.getNumberOfStations());
    }

    @Test
    public void shouldShowNumberOfStationByDefault() {
        Assertions.assertEquals(10,radio.getNumberOfStations());
    }

    @Test
    public void shouldSetStation5() {
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStation11() {
        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation1() {
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation0() {
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStation7() {
        radio.setCurrentStation(6);
        radio.nextStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetStation_1() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation8() {
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume50() {
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume102() {
        radio.setCurrentVolume(102);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume_3() {
        radio.setCurrentVolume(-3);
        int expected = 100;
        int actual = radio.getCurrentVolume();
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(22);
        radio.increaseVolume();
        int expected = 23;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}





