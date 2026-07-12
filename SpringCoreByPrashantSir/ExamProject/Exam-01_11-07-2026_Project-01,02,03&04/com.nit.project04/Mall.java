package com.nit.project04;

import java.util.Map;

public class Mall {

    private int mallId;
    private String mallName;
    private Owner owner;
    private Map<String, Double> parkingCharges;

    public Mall(int mallId, String mallName, Owner owner,
            Map<String, Double> parkingCharges) {

        this.mallId = mallId;
        this.mallName = mallName;
        this.owner = owner;
        this.parkingCharges = parkingCharges;
    }

    @Override
    public String toString() {

        return "Mall Details\n"
                + "-------------------------\n"
                + "Mall Id          : " + mallId
                + "\nMall Name        : " + mallName
                + "\nOwner            : " + owner
                + "\nParking Charges  : " + parkingCharges;
    }
}
