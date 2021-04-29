package com.glinkaz.ship;

import java.util.ArrayList;
import java.util.List;

public class Compartment {
    private int numberOfPassengers;
    private List<Passenger> passengers;

    public Compartment(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
        passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
