package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Footballer> footballers = new ArrayList<>();

    private static int id = 3;

    static {
        footballers.add(new Footballer
                (1, "Sergio", "Alvarez", 1000000, "Real Sociedad", 75000000));
        footballers.add(new Footballer
                (2, "Ruslan", "Malinovskyi", 1700000, "Atalanta", 55000000));
    }

    public static ArrayList<Footballer> getFootballers() {
        return footballers;
    }

    public static void addFootballer(Footballer footballer) {
        footballer.setId(id);
        id++;
        footballers.add(footballer);
    }
}
