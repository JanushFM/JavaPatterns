package FactoryMethod;

public class PickupTruck extends PassengerCar{
    PickupTruck(int bodyCapacity, float price, int numWheels, float carSpeed, int fuelTank) {
        super(CarType.PICKUPTRUCK, price, numWheels, carSpeed, fuelTank);
        this.bodyCapacity = bodyCapacity;
    }

    private int bodyCapacity;

    @Override
    protected void display() {
        System.out.print("Body Capacity:" + bodyCapacity);
    }
}
