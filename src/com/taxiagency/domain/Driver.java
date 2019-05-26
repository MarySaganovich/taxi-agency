package com.taxiagency.domain;

public class Driver implements Entity {
    private String id;
    private DriversName driversName;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String b) {
    }

    public Driver(String id, DriversName driversName) {
        this.id = id;
        this.driversName = driversName;
    }

//    private static String randomDriversName() {
//        String names = "qazwsxedcrfvtgbyhnujmikol";
//        StringBuilder rDriversname = new StringBuilder();
//        for (int b = 0; b < 5; b++) {
//            rDriversname.append(names.charAt((int) (Math.random() * names.length())));
//        }
//        return firstUpperCase(rDriversname.toString());
//    }
//
//    public void setDriversName() {
//
//        this.driversName = randomDriversName();
//    }

    @Override
    public String toString() {
        return "\n(id:" + id + ", driversName:" + driversName + ")";
    }

//    private static String firstUpperCase(String word){
//        if(word == null || word.isEmpty()) return ""; //или return word;
//        return word.substring(0, 1).toUpperCase() + word.substring(1);
//    }
}
