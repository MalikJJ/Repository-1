package _5_1_abstract_classes;

public class Burger extends Food {
    private int meatAmount;
    private int meatType; // 1 beef, 2 chicken

    public Burger() {
    }
    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public int getMeatAmount() {
        return meatAmount;
    }

    public int getMeatType() {
        return meatType;
    }

    @Override
    public double getCalories() {
        if (meatType == 1) return meatAmount * 840;
        else return meatAmount * 560;
    }

    @Override
    public String toString() {
        if (meatType == 1) {
            return "Burger " + super.toString() +
                    ", amount of meat " + meatAmount +
                    ", meat type beef";
        }
        else return "Burger " + super.toString() +
                ", meat amount " + meatAmount +
                ", meat type chicken";
    }
}

//===================================================================

