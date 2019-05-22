package com.taxiagency.domain;

public class Driver implements Entity {
    private String id;
    private String name;
@Override
    public String getId() {
        return id;
    }

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
@Override
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
