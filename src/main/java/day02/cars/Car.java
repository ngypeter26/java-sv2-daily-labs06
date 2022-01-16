package day02.cars;

public class Car {
    private String brand;
    private double motorSize;
    private Color color;
    private int price;

    public void decreasePrice(int percent) {
        double priceDouble = price;
        double priceAccurate = priceDouble * (100.0 - (double) percent) / 100.0;
        price = (int) priceAccurate;        // ez talán pontosabb és megbízhatóbb
//        price = price * (100 - percent) / 100;  // ez is működött
    }

    public Car(String brand, double motorSize, Color color, int price) {
        this.brand = brand;
        this.motorSize = motorSize;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getMotorSize() {
        return motorSize;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
