package com.glinkaz.ship;

import java.util.LinkedHashSet;

public class Wharf {
    LinkedHashSet<Passenger> passengers;
    public Wharf() {
        passengers = new LinkedHashSet<>();
        for (int i = 0; i < 500; i++) {
            passengers.add((new Passenger()));
        }
    }

    public LinkedHashSet<Passenger> getPassengers() {
        return passengers;
    }
}
