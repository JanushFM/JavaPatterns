package FactoryMethod;

import java.util.Scanner;

public class CarFactory {
    public static AbstractCar buildCar(CarType model) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of wheels in your car: ");
        int numWheels = in.nextInt();

        System.out.print("Input maximum speed of your car: ");
        int carSpeed = in.nextInt();

        System.out.print("Input car's cost: ");
        float carCost = in.nextFloat();

        System.out.print("Input fuel tank volume:");
        int fuelTankVolume = in.nextInt();

        AbstractCar car = null;
        switch (model) {
            case CABRIOLET -> {
                System.out.print("Input number of doors: ");
                int doorsNumber = in.nextInt();
                car = new Cabriolet(doorsNumber, carCost, numWheels, carSpeed, fuelTankVolume);
            }
            case LIMOUSINE -> {
                System.out.print("Input number of seats: ");
                int seatsNumber = in.nextInt();
                car = new Limousine(seatsNumber, carCost, numWheels, carSpeed, fuelTankVolume);
            }
            case PICKUPTRUCK -> {
                System.out.print("Input body capacity: ");
                int bodyCapacity = in.nextInt();
                car = new PickupTruck(bodyCapacity, carCost, numWheels, carSpeed, fuelTankVolume);
            }
            default -> System.out.print("No trespassing");
        }
        System.out.print("\n");
        return car;
    }
}
