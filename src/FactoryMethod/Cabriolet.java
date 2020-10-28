package FactoryMethod;

public class Cabriolet extends PassengerCar{
    Cabriolet(int doorsNumber, float price, int numWheels, float carSpeed, int fuelTank) {
        super(CarType.CABRIOLET, price, numWheels, carSpeed, fuelTank);
        this.doorsNumber = doorsNumber;
    }

    private int doorsNumber;

    @Override
    protected void display() {
        System.out.println("Doors number:" + doorsNumber);
        System.out.print("Car cost:" + getPrice());
    }
}
