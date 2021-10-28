package com.com.alexandra;

import java.util.HashMap;
import java.util.Scanner;

public class CarRentalSystem {

    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, String> rentedCars = new HashMap<String, String>(100, 0.5f);
    private static HashMap<String,RentedCars> rentCarToOwner = new HashMap<>(100, 0.5f);

    private static String getPlateNo() {
        System.out.println("Introduceti numarul de inmatriculare:");
        String plateNo = sc.nextLine();

        if (isCarRent(plateNo)) {
            System.out.println("ERROR:Autoturismul exista in colectie");
        }

        return plateNo;
    }

    private static String getOwnerName() {
        System.out.println("Introduceti numele proprietarului:");
        String ownerName = sc.nextLine();
        return ownerName;
    }

    // search for a key in hashtable
    private static boolean isCarRent(String plateNo) {
        return rentedCars.containsKey(plateNo);
    }

    // get the value associated to a key
    private static String getCarRent(String plateNo) {
        if (rentedCars.get(plateNo) == null) {
            System.out.println("Plate no introdus este incorect");
            return null;
        }
        return rentedCars.get(plateNo);
    }

    private static int getTotalNrOfRentedCars() {
        System.out.println("Numarul de masini inchiriate este:");
        return totalRented();
    }

    // add a new (key, value) pair
    private void rentCar(String plateNo, String ownerName) {
        rentedCars.put(plateNo, ownerName);

        if(!rentCarToOwner.containsKey(ownerName)) {
            RentedCars carList = new RentedCars();
            carList.addCar(plateNo);
            rentCarToOwner.put(ownerName, carList);
        } else {
        	RentedCars currentOwner = rentCarToOwner.get(ownerName);
            currentOwner.addCar(plateNo);
        }
    }


    // remove an existing (key, value) pair
    private void returnCar(String plateNo) {
        if (!isCarRent(plateNo)) {
            System.out.println("Error: Masina cu plate no " + plateNo + " nu exista in sistem");
        } else {
            rentedCars.remove(plateNo);
            System.out.println("Plate number succesfully deleted");
        }

        String owner = rentedCars.get(plateNo);
        
      
        RentedCars carsList = rentCarToOwner.get(owner);

	        if (carsList != null && carsList.isCarInList(plateNo)) {
	            System.out.println(carsList.showCarList());
	            carsList.removeCar(plateNo);
	            System.out.println("removed: " + carsList.showCarList());
	
	        } else {
	            System.out.println("ERROR: car not in list");
	            System.out.println(carsList.showCarList());
	        }

    }

    private String getOwnerName(String plateNo) {
        return rentedCars.get(plateNo);
    }

    private static int totalRented() {
        return rentedCars.size();
    }


    ///
    private static int getCarsNo() {
        return rentCarToOwner.size();
    }

    private static RentedCars getCarsList(){
        return rentCarToOwner.get(getCarsList());
    }


    private static void printCommandsList() {
        System.out.println("help         - Afiseaza aceasta lista de comenzi");
        System.out.println("add          - Adauga o noua pereche (masina, sofer)");
        System.out.println("check        - Verifica daca o masina este deja luata");
        System.out.println("remove       - Sterge o masina existenta din hashtable");
        System.out.println("getOwner     - Afiseaza proprietarul curent al masinii");
        System.out.println("totalCars     - Afiseaza numarul total demasini");
        System.out.println("quit         - Inchide aplicatia");
    }

    public void run() {
        boolean quit = false;
        while(!quit) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            String command = sc.nextLine();
            switch(command) {
                case "help":
                    printCommandsList();
                    break;
                case "add":
                    rentCar(getPlateNo(), getOwnerName());
                    break;
                case "check":
                    System.out.println(isCarRent(getPlateNo()));
                    break;
                case "remove":
                    returnCar(getPlateNo());
                    break;
                case "getOwner":
                    System.out.println(getCarRent(getPlateNo()));
                    break;
                case "totalCars":
                    System.out.println(getTotalNrOfRentedCars());
                    break;
                case "quit":
                    System.out.println("Aplicatia se inchide...");
                    quit = true;
                    break;
                default:
                    System.out.println("Unknown command. Choose from:");
                    printCommandsList();
            }
        }
    }

    public static void main(String[] args) {

        // create and run an instance (for test purpose)
        new CarRentalSystem().run();

    }
}
