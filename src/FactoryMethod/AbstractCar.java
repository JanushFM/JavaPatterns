package FactoryMethod;

public abstract class AbstractCar {
    public AbstractCar(CarType model, float price, int numWheels, float carSpeed) {
        this.price = price;
        this.model = model;
        this.wheels = numWheels;
        this.speed = carSpeed;
    }

    private float price;
    private int wheels;
    private float speed;
    private CarType model = null;

    public int getWheels() {
        return wheels;
    }

    public float getPrice() {
        return price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public void setSpeed(float speed) {
        this.speed = speed;
    }

    protected abstract void display();


    public CarType getModel() {
        return model;
    }

    private void setModel(CarType model) {
        this.model = model;
    }
}
