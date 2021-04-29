package com.glinkaz.ship.staff;

import com.glinkaz.ship.Passenger;

public class PassengerNotOnListException extends Exception{
    public Passenger passenger;
    public PassengerNotOnListException(Passenger passenger) {
        this.passenger = passenger;
    }
}
