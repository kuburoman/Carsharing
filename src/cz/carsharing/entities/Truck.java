package cz.carsharing.entities;

/**
 * Created by Nell-NTB on 25.2.2015.
 */
public class Truck extends Vehicle {

    private int numberOfWheels;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}