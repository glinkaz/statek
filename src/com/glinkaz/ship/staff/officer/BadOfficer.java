package com.glinkaz.ship.staff.officer;

import com.glinkaz.ship.Ship;
import com.glinkaz.ship.staff.PassengerNotOnListException;

public class BadOfficer extends Officer{
    public BadOfficer(Ship ship) {
        super(ship);
    }

    public boolean checkList() throws PassengerNotOnListException {
        return checkList1(10);
    }

    @Override
    public String toString() {
        return " BadOfficer ";
    }
}
