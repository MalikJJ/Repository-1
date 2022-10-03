package _5_3_abstract_classes;

public abstract class Engine {
    private double engineVolume;
    private int cylinderAmount;
    private double engineWeight;

    abstract double efficiency();
    abstract double throttleEnergy();
    abstract double breakEnergy();

    protected double getMaxSpeed() {
        return (throttleEnergy() - breakEnergy() * efficiency());
    }

    public Engine() {
    }
    public Engine(double engineVolume, int cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(int cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }

    @Override
    public String toString() {
        return "engine volume " + engineVolume +
                ", cylinder amount " + cylinderAmount +
                ", engine weight " + engineWeight;
    }
}

//------------------------------------------------------------------------------

