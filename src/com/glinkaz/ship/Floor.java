package com.glinkaz.ship;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    public List<Compartment> compartments;
    private int numberOfPassengers;

    public Floor(int numberOfPassengers, int numberOfCompartments) {
        this.numberOfPassengers = numberOfPassengers;
        compartments = new ArrayList<>();
        for (int i = 0; i < numberOfCompartments; i++) {
            compartments.add(new Compartment(numberOfPassengers));
        }
    }

    public int numberOfAllPassengers(){
        return compartments.size()*numberOfPassengers;
    }

    public int numberOfAllLuggage(){
        return 0; //TODO
    }


}
