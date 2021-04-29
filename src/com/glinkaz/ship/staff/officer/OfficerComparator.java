package com.glinkaz.ship.staff.officer;

import java.util.Comparator;

public class OfficerComparator implements Comparator<Officer> {

    @Override
    public int compare(Officer o1, Officer o2) {
        if((o1 instanceof GoodOfficer && o2 instanceof GoodOfficer) || (o1 instanceof BadOfficer && o2 instanceof BadOfficer)){
            return 0;
        }else if(o1 instanceof GoodOfficer && o2 instanceof BadOfficer){
            return 1;
        }else{
            return -1;
        }
    }


}
