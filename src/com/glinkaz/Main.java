package com.glinkaz;

import com.glinkaz.ship.Floor;
import com.glinkaz.ship.Ship;
import com.glinkaz.ship.Wharf;
import com.glinkaz.ship.staff.AccidentException;
import com.glinkaz.ship.staff.Capitan;
import com.glinkaz.ship.staff.officer.BadOfficer;
import com.glinkaz.ship.staff.officer.GoodOfficer;
import com.glinkaz.ship.staff.officer.Officer;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Wharf wharf = new Wharf();
        Capitan capitan = new Capitan(wharf);

        Ship ship = new Ship();
        ship.setCapitan(capitan);
        capitan.setShip(ship);
        Officer officer3 = new BadOfficer(ship);
        Officer officer4 = new BadOfficer(ship);
        Officer officer1 = new GoodOfficer(ship);
        Officer officer2 = new GoodOfficer(ship);
        Officer officer5 = new GoodOfficer(ship);
        ship.addOfficer(officer1);
        ship.addOfficer(officer3);
        ship.addOfficer(officer4);
        ship.addOfficer(officer2);
        ship.addOfficer(officer5);
        System.out.println(ship.getOfficers());

        Floor floor1 = new Floor(2, 11);
        Floor floor2 = new Floor(4, 17);
        Floor floor3 = new Floor(3, 16);
        Floor floor4 = new Floor(4, 14);
        Floor floor5 = new Floor(2, 17);
        Floor floor6 = new Floor(3, 13);
        Floor floor7 = new Floor(4, 14);
        ship.addFloor(floor1);
        ship.addFloor(floor2);
        ship.addFloor(floor3);
        ship.addFloor(floor4);
        ship.addFloor(floor5);
        ship.addFloor(floor6);
        ship.addFloor(floor7);
        try {
            capitan.go();
        }catch(AccidentException e){
            System.out.println(e.getMessage());
        }
        capitan.randomFloorForPassenger();
        capitan.officerToCheck();

    }
}
