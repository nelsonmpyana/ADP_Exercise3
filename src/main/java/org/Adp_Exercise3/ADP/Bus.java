package org.Adp_Exercise3.ADP;

public class Bus extends Vehicle {
    private String busCompanyName;

    public Bus() {
    }

    public Bus(String busCompanyName) {
        this.busCompanyName = busCompanyName;
    }

    public String getBusCompanyName() {
        return busCompanyName;
    }

    public void setBusCompanyName(String busCompanyName) {
        this.busCompanyName = busCompanyName;
    }

    @Override
    public void move() {
        System.out.println(busCompanyName + " is moving very fast");
    }

    @Override
    public void wheels() {
        System.out.println("Bus has eight wheels");
    }
}
