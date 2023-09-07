package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldShowNumberOfInstalledStations20() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(20, radio.getNumberOfStations());
        Assertions.assertEquals(19, radio.getMaxCurrentStation());
    }

    @Test
    public void shouldSetStation15() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        Assertions.assertEquals(15, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStation20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }



    @Test
    public void shouldShowNumberOfStationByDefault() {
        Assertions.assertEquals(10, radio.getNumberOfStations());
    }

    @Test
    public void shouldSetStation5() {
        radio.setCurrentStation(5);
        Assertions.assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStation11() {
        radio.setCurrentStation(11);
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation1() {
        radio.setCurrentStation(0);
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation0() {
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldSetStation7() {
        radio.setCurrentStation(6);
        radio.nextStation();
        Assertions.assertEquals(7, radio.getCurrentStation());

    }

    @Test
    public void shouldNotSetStation_1() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation8() {
        radio.setCurrentStation(9);
        radio.prevStation();
        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume50() {
        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolume102() {
        radio.setCurrentVolume(102);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolume_3() {
        radio.setCurrentVolume(-3);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(22);
        radio.increaseVolume();
        Assertions.assertEquals(23, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        Assertions.assertEquals(9, radio.getCurrentVolume());
    }
}





