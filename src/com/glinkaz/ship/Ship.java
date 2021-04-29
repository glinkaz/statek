package com.glinkaz.ship;

import com.glinkaz.ship.staff.Capitan;
import com.glinkaz.ship.staff.officer.Officer;
import com.glinkaz.ship.staff.officer.OfficerComparator;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.Stack;

public class Ship <T extends EngineRoom>{
    public List<Passenger> passengers;
    private Capitan capitan;
    private Stack<Officer> officers;
    private List<Floor> floors;
    private LinkedHashSet<Passenger> deck;
    private EngineRoom engineRoom;


    public Ship() {
        engineRoom = new EngineRoom();
        passengers = new LinkedList<>();
        floors = new LinkedList<>();
//        for (int i = 0; i < 7; i++) {
//            floors.add(new Floor());
//        }
        deck = new LinkedHashSet<>();
        officers = new Stack<>();
    }

    public void addToDeck(Passenger passenger){
        deck.add(passenger);
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public void addOfficer(Officer officer) {
        this.officers.add(officer);
        Collections.sort(officers, new OfficerComparator());
    }

    public void addFloor(Floor floor){
        floors.add(floor);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Stack<Officer> getOfficers() {
        return officers;
    }

    public LinkedHashSet<Passenger> getDeck() {
        return deck;
    }

    public EngineRoom getEngineRoom() {
        return engineRoom;
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
