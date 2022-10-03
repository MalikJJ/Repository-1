package _5_2_abstract_classes;

public abstract class GoldShape {
    private double volume;

    abstract double getVolume();

    double getPrice() {
        return getVolume() * 250 + 1200;
    }

    @Override
    public String toString() {
        return "volume=" + volume;
    }
}

//-------------------------------------------------------------------------

