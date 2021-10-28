package com.com.alexandra;

import java.util.ArrayList;

public class RentedCars {
    private ArrayList<String> carlist;

    public RentedCars() {
        this.carlist = new ArrayList<>();
    }

    public ArrayList<String> getRentedCarlist() {
        return carlist;
    }

    public boolean removeCar(String carPlateNo) {
        return this.carlist.remove(carPlateNo);
    }

    public boolean addCar(String carPlateNo) {
        return this.carlist.add(carPlateNo);
    }

    public boolean isCarInList(String carPlateNo) {
        return this.carlist.contains(carPlateNo);
    }

    public int getCarListSize() {
        return this.carlist.size();
    }

    public String showCarList() {
        return this.carlist.toString();
    }

}