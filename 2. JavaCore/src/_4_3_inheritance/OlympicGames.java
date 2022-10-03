package _4_3_inheritance;

import java.util.Arrays;

public class OlympicGames {
    private String city;
    private int year;
    private Sportsman[] sportsmenList;
    public OlympicGames(String city, int year, Sportsman[] sportsmenList) {
        this.city = city;
        this.year = year;
        this.sportsmenList = sportsmenList;
    }
    public OlympicGames() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Sportsman[] getSportsmenList() {
        return sportsmenList;
    }

    public void setSportsmenList(Sportsman[] sportsmenList) {
        this.sportsmenList = sportsmenList;
    }

    @Override
    public String toString() {
        return "OlympicGames " +
                "city " + city +
                ", year " + year +
                ", sportsmenList " + Arrays.toString(sportsmenList);
    }

    public void play() {
        for (int i = 0; i < sportsmenList.length; i++) {
            System.out.println((i + 1) + ". " + sportsmenList[i] + " is playing");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }
}

///// -------------------------------------------------------

