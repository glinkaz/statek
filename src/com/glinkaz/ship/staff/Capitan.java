package com.glinkaz.ship.staff;

import com.glinkaz.ship.Floor;
import com.glinkaz.ship.Passenger;
import com.glinkaz.ship.Ship;
import com.glinkaz.ship.Wharf;
import com.glinkaz.ship.staff.officer.Officer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Capitan {
    Random random = new Random();
    private Ship ship;
    protected List<Passenger> listOfPassengers;
    private Wharf wharf;
    private LinkedHashSet<Passenger> passengers;
    private List<Passenger> passengersNotOnList;
    int i = 0;
    public Capitan(Wharf wharf) {
        this.listOfPassengers = new LinkedList<>();
        this.wharf = wharf;
        this.passengers = wharf.getPassengers();
        this.passengersNotOnList = new LinkedList<>();
    }

    public void randomFloorForPassenger() {
        int i = 0;
        for(Passenger passenger : passengers) {
            passenger.setShip(ship);
            Floor randomFloor = (Floor) ship.getFloors().get(random.nextInt(ship.getFloors().size()));
            passenger.lookForSeat(randomFloor);
            ship.addPassenger(passenger);
            i++;
            if(i%20 != 0){
                listOfPassengers.add(passenger);
            }else{
                System.out.println("Dlugopis mi sie wypisal");
            }
        }
    }

    public void go() throws AccidentException {
        while(true){
            if(i%20 != 19) {
                ship.getEngineRoom().go();
                ++i;
            }else{
                throw new AccidentException("Koniec rejsu! Dryfujemy.");
            }
        }
    }

    private Officer randomOfficerCheckList(){
        Officer officer = (Officer)ship.getOfficers().get(0);
        Iterator<Officer> iterator = ship.getOfficers().iterator();
        for (int j = 0; j < random.nextInt(ship.getOfficers().size()); j++) {
            officer = iterator.next();
        }
        return officer;
    }

    public void officerToCheck(){

        Officer officer = randomOfficerCheckList();
        boolean ifAll = false;
        while(!ifAll){
            try {
                ifAll = officer.checkList();
            } catch (PassengerNotOnListException e) {
                System.out.println("Nie ma cie na liscie pasazerow!");
                listOfPassengers.add(e.passenger);
                passengersNotOnList.add(e.passenger);

            }
        }
        System.out.println(passengersNotOnList + " pasazerow nie bylo na liscie");
        ship.getEngineRoom().stop();
    }


    public void listPassenger(){
        for (Passenger passenger : passengers){
            System.out.println(passenger);
        }
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public List<Passenger> getListOfPassengers() {
        return listOfPassengers;
    }
}
