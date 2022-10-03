package kz.bitlab.db;

public class User {

    private String name;
    private String surname;
    private String orderedFood;

    public User() {
    }

    public User(String name, String surname, String orderedFood) {
        this.name = name;
        this.surname = surname;
        this.orderedFood = orderedFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOrderedFood() {
        return orderedFood;
    }

    public void setOrderedFood(String orderedFood) {
        this.orderedFood = orderedFood;
    }
}
