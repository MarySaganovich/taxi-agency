package com.taxiagency.domain;

public class Passenger implements Entity {
    private String id;
    private String name;
    private String mobilePhone;
@Override
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
@Override
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
