package com.glinkaz.ship.staff.officer;

import com.glinkaz.ship.Ship;
import com.glinkaz.ship.staff.PassengerNotOnListException;

public class GoodOfficer extends Officer{
    public GoodOfficer(Ship ship) {
        super(ship);
    }

    public boolean checkList() throws PassengerNotOnListException {
        return checkList1(1);
    }

    @Override
    public String toString() {
        return " GoodOfficer ";
    }
}
