package com.exercise.zadania2ProgramowanieObjektowe_I.zad1;

public class Cabrio {

    private String name;
    private String brand;
    private boolean isMoving;
    private boolean isRoofOpen;

    public Cabrio(String name, String brand, boolean isMoving, boolean isRoofOpen) {
        this.name = name;
        this.brand = brand;
        this.isMoving = isMoving;
        this.isRoofOpen = isRoofOpen;
    }

    public Cabrio(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        System.out.println("Car change status on " + moving );
        isMoving = moving;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if (isMoving) {
            System.out.println("car is moving. this option is not available");
        } else {
            System.out.println("roof was opened");
            this.isRoofOpen = roofOpen;
        }
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", isMoving=" + isMoving +
                ", isRoofOpen=" + isRoofOpen +
                '}';
    }
}
