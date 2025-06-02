package TaskMaster.Task28_05_2025;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private int year;

    @Override
    public String toString() {
        return "Car{brand=" + brand + ", model= " + model + ", year=" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car otherCar = (Car) o;
        return brand.equals(((Car) o).brand) &&
                model.equals(((Car) o).model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year) * 31;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
