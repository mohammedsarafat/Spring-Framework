package com.nit.project04;

public class Owner {

    private int ownerId;
    private String ownerName;
    private String contactNumber;

    public Owner(int ownerId, String ownerName, String contactNumber) {

        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {

        return ownerName +
                " (ID : " + ownerId +
                ", Contact : " + contactNumber + ")";
    }
}
