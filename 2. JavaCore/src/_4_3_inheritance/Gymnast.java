package _4_3_inheritance;

public class Gymnast extends Sportsman {
    private int height;
    private int weight;
    String style;
    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }
    public Gymnast() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Gymnast " + super.toString() +
                ", height " + height +
                ", weight " + weight +
                ", style " + style;
    }
    @Override
    public void play() {
        System.out.println(toString() + " is playing");
    }
}

///// -------------------------------------------------------

