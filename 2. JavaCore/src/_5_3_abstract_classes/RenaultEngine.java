package _5_3_abstract_classes;

public class RenaultEngine extends Engine {
    private double extraTurboEnergy;

    public RenaultEngine() {
    }
    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }
    @Override
    double efficiency() {
        return 0.27;
    }

    @Override
    double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 110 + extraTurboEnergy;
    }

    @Override
    double breakEnergy() {
        return getEngineWeight() * 2.1;
    }

    @Override
    public String toString() {
        return "Renault " + super.toString() +
                ", extra turbo energy " + extraTurboEnergy;
    }
}

//------------------------------------------------------------------------------

