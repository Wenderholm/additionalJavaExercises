package com.exercise.zadania2ProgramowanieObjektowe_I.zad1;

public class Main {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Avensis", "Toyota", false,false);
        System.out.println(cabrio);
        cabrio.setRoofOpen(true);
        System.out.println(cabrio);

        Cabrio cabrio2 = new Cabrio("Corolla", "Toyota", true,false);
        System.out.println(cabrio2);
        cabrio2.setRoofOpen(true);
        System.out.println(cabrio2);

        Cabrio cabrio3 = new Cabrio("Yaris", "Toyota");
        cabrio3.setRoofOpen(true);
        System.out.printf("Car status. Car is moving: %s, Roof is open: %s \n", cabrio3.isMoving(),cabrio3.isRoofOpen());
        cabrio3.setMoving(true);
        cabrio3.setRoofOpen(false);
        System.out.printf("Car status. Car is moving: %s, Roof is open: %s \n", cabrio3.isMoving(),cabrio3.isRoofOpen());
    }
}
