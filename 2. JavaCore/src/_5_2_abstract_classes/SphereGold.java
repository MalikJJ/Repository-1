package _5_2_abstract_classes;

public class SphereGold extends GoldShape {
    private double radius;

    public SphereGold() {
    }
    public SphereGold(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * 3.14 * (Math.pow(radius, 3));
    }

    @Override
    public String toString() {
        return "Sphere Gold with radius " + radius + " centimeters";
    }
}

//-------------------------------------------------------------------------

