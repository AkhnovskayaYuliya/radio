package ru.netology.radio;

public class Radio {
    private int minCurrentStation = 0;
    private int maxCurrentStation = 9;
    private int numberOfStations = 10;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int numberOfRadioStations){
        this.numberOfStations = numberOfRadioStations;
    }

    public Radio () {
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxCurrentStation) {
            return;
        }
        if (newCurrentStation < minCurrentStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxCurrentStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }


    public void prevStation() {
        if (currentStation > minCurrentStation) {
            currentStation--;
        } else {
            currentStation = maxCurrentStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}
