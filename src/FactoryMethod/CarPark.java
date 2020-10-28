package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private List<AbstractCar> carList = new ArrayList<>();

    public void addCar(AbstractCar car) {
        carList.add(car);
    }

    public void removeCar(AbstractCar car) {
        carList.remove(car);
    }

    public List<AbstractCar> getCarList() {
        return carList;
    }

    public static float calculateCost(CarPark carPark) {
        float sum = 0;
        for (AbstractCar car : carPark.getCarList()) {
            sum += car.getPrice();
        }
        return sum;
    }
}
