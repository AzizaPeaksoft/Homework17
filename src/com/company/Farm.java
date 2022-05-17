package com.company;

import java.util.Arrays;

public class Farm {

    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String ownerName;

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    public Farm() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm " +
                "address = " + address + "\n" +
                " Cows = " + Arrays.toString(cows) + "\n"+
                " Horses = " + Arrays.toString(horses) + "\n"+
                " Sheep = " + Arrays.toString(sheep) + "\n"+
                " OwnerName = " + ownerName  +
                " ";
    }
}

