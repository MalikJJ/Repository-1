package _4_1_inheritance;

public class Mercedes extends Car {
    private String classType;
    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }
    public Mercedes() {
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", class type: " + classType;
    }

    @Override
    public void ride() {
        System.out.println(toString() + " is riding");
    }
}

// -------------------------------------------------------

