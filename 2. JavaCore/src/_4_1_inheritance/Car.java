package _4_1_inheritance;

public class Car {
    private String name;
    private String model;
    private int maxSpeed;
    private int year;
    private double volume;
    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }
    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name + " " + model +
                ", max speed " + maxSpeed + "km/h" +
                ", year " + year +
                ", engine volume " + volume + " liters";
    }

    public void ride() {
        System.out.println(toString() + " is riding");
    }
}

// -------------------------------------------------------

