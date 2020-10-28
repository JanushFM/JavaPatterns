package FactoryMethod;

public class TestFactory {
    public static void main(String[] args){
        var cabriolet = CarFactory.buildCar(CarType.CABRIOLET);
        var limousine = CarFactory.buildCar(CarType.LIMOUSINE);
        var pickupTruck = CarFactory.buildCar(CarType.PICKUPTRUCK);

        CarPark carPark = new CarPark();
        carPark.addCar(cabriolet);
        carPark.addCar(limousine);
        carPark.addCar(pickupTruck);

        float costCars = CarPark.calculateCost(carPark);
        System.out.print("Cost of all cars: " + costCars);
    }
}
