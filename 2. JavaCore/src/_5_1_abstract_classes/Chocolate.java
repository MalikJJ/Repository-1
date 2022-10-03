package _5_1_abstract_classes;

public class Chocolate extends Food {
    private int weight;

    public Chocolate() {
    }
    public Chocolate(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public double getCalories() {
        return weight * 740;
    }

    @Override
    public String toString() {
        return "Chocolate " + super.toString() +
                ", weight " + weight + " grams";
    }
}

//===================================================================

