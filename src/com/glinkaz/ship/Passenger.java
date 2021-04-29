package com.glinkaz.ship;

import java.util.LinkedHashSet;
import java.util.Set;

public class Passenger {
    private static int idPassenger = 0;
    private Ship ship;
    public final int ID;

    public Passenger() {
        this.ID = idPassenger++;
    }



    public void lookForSeat(Floor floor){
        for(Compartment compartment : floor.compartments){
            if(compartment.getPassengers().size() < compartment.getNumberOfPassengers()){
                compartment.addPassenger(this);
            }else{
                ship.addToDeck(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                ", id=" + ID +
                '}';
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
