package com.glinkaz.ship.staff.officer;

import com.glinkaz.ship.Passenger;
import com.glinkaz.ship.Ship;
import com.glinkaz.ship.staff.PassengerNotOnListException;

import java.util.List;
import java.util.Random;

public abstract class Officer {
    Random random = new Random();
    private Ship ship;
    private List<Passenger> pass;

    public Officer(Ship ship) {
        this.ship = ship;
        this.pass = ship.getPassengers();
    }
    public abstract boolean checkList() throws PassengerNotOnListException;

    public  boolean checkList1(int possibility) throws PassengerNotOnListException {
//        for(Passenger passenger : ship.getPassengers()){
        boolean ifChecked = false;
        int i = 0;
        for(Passenger passenger : pass){
            i ++;
            if(0==random.nextInt(possibility));
            if(!ship.getCapitan().getListOfPassengers().contains(passenger)){
                throw new PassengerNotOnListException(passenger);
            }
            if(i  == pass.size()){
                ifChecked = true;
            }
        }
        return ifChecked;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

}
