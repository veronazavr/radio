package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextCurrentStationNormal(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        radio.nextCurrentStation();
        assertEquals(3,radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationMaxBorder(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationNormal(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        radio.prevCurrentStation();
        assertEquals(1,radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationMinBorder(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationNormal(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        radio.remoteCurrentStation(3);
        assertEquals(3,radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationOverMaxStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        radio.remoteCurrentStation(10);
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationUndereMinStation(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(2);
        radio.remoteCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }


}