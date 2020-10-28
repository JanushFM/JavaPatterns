package FactoryMethod;

public class PassengerCar extends AbstractCar{
    private int fuelTankVolume;

    public PassengerCar(CarType model, float price, int numWheels, float carSpeed, int fuelTankVolume) {
        super(model, price, numWheels, carSpeed);
        this.fuelTankVolume = fuelTankVolume;
    }


    public void setFuelTankVolume(int Fuel) {
        fuelTankVolume = Fuel;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    @Override
    protected void display() {

    }
}
