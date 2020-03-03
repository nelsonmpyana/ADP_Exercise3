package org.Adp_Exercise3.ADP;

public class Quadbike extends Vehicle {

    private int maximumSpeed;

    public Quadbike() {
    }

    public Quadbike(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public void move() {
        System.out.println("Quadbike maximum speed is " + maximumSpeed + "kph");
    }

    @Override
    public void wheels() {
        System.out.println("Quadbike has four wheels");
    }
}
