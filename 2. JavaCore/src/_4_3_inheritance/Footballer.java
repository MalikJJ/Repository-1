package _4_3_inheritance;

public class Footballer extends Sportsman {
    private String position;
    private String club;
    public Footballer (String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }
    public Footballer () {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Footballer " + super.toString() +
                ", position " + position +
                ", club " + club;
    }
    @Override
    public void play() {
        System.out.println(toString() + " is playing");
    }
}

///// -------------------------------------------------------

