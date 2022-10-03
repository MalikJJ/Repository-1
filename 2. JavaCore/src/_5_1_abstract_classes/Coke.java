package _5_1_abstract_classes;

public class Coke extends Food {
    private double volumeLiters;
    private boolean isSparkling;

    public Coke() {
    }
    public Coke (String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling) return volumeLiters * 400;
        else return volumeLiters * 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", volume " + volumeLiters + " liters";
    }
}

//===================================================================

