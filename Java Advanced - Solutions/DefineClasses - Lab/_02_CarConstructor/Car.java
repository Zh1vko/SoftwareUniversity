package _02_CarConstructor;

public class Car {
    private String brand;
    private String model;
    private int horsePower;


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Car (String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }
    public Car (String brand, String model, int horsePower) {
        this(brand);
        this.model = model;
        this.horsePower = horsePower;

    }


    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
    }
}