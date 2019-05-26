package com.taxiagency.domain;

public class Passenger implements Entity {
    private String id;
    private String passengersName;
    private String passengersPhoneNumber;

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void setId(String b) {

    }

    public Passenger(String id, String passengersName, String passengersPhoneNumber) {
        this.id = id;
        this.passengersName = passengersName;
        this.passengersPhoneNumber = passengersPhoneNumber;
    }
}
