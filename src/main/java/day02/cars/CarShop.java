package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public boolean addCar(Car car) {
        if (car.getPrice() > maxPrice) {
            return false;
        } else {
            carsForSell.add(car);
            return true;
        }
    }

    public int sumCarPrice() {
        int sumCarPrice = 0;
        for (Car i : carsForSell) {
            sumCarPrice += i.getPrice();
        }
        return sumCarPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCheaperCars = 0;
        for (Car i : carsForSell) {
            numberOfCheaperCars += i.getPrice() > price ? 0 : 1;
        }
        return numberOfCheaperCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsWithBrand = new ArrayList<>();
        for (Car i : carsForSell) {
            if (i.getBrand().equalsIgnoreCase(brand)) {
                carsWithBrand.add(i);
            }
        }
        return carsWithBrand;
    }

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }
}
