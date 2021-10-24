package web.model;

public class Car {

    String name;
    int YearOfManufacture;
    String color;

    public Car(String name, int yearOfManufacture, String color) {
        this.name = name;
        YearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        YearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", YearOfManufacture=" + YearOfManufacture +
                ", color='" + color + '\'' +
                '}';
    }
}
