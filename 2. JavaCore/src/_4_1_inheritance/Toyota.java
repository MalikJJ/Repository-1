package _4_1_inheritance;

public class Toyota extends Car {
    private String manufacturer;
    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }
    public Toyota() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", manufacturer: " + manufacturer;
    }

    @Override
    public void ride() {
        System.out.println(toString() + " is riding");
    }
}

// -------------------------------------------------------

