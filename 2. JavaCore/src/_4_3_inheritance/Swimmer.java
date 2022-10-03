package _4_3_inheritance;

public class Swimmer extends Sportsman {
    private String style;
    private double recordTime;
    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }
    public Swimmer() {
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "Swimmer " + super.toString() +
                ", style " + style +
                ", recordTime " + recordTime;
    }
    @Override
    public void play() {
        System.out.println(toString() + " is playing");
    }
}

///// -------------------------------------------------------

