package FactoryMethod;

public class Limousine extends PassengerCar{
    Limousine(int seatsNumber, float price, int numWheels, float carSpeed, int fuelTank) {
        super(CarType.LIMOUSINE, price, numWheels, carSpeed, fuelTank);
        this.seatsNumber = seatsNumber;
    }

    private int seatsNumber;

    @Override
    protected void display() {
        System.out.print("Number of seats:" + seatsNumber);
    }
}
