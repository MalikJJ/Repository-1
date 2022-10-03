package _5_2_abstract_classes;

public class CubeGold extends GoldShape {
    private double side;
    public CubeGold() {
    }

    public CubeGold(double side) {
        this.side = side;
    }

        @Override
        double getVolume() {
            return Math.pow(side, 3);
        }

    @Override
    public String toString() {
        return "Cube Gold with side " + side + " centimeters";
    }
}

//-------------------------------------------------------------------------

