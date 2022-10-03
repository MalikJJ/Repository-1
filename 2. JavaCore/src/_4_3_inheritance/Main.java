package _4_3_inheritance;

public class Main {
    public static void main(String[] args) {
        Gymnast gymnast1 = new Gymnast("Yernar Yerimbetov", 42,
                "Kazakhstan",180, 75, "sports gym");
        Gymnast gymnast2 = new Gymnast("Nariman Kurbanov",24,
                "Kazakhstan", 175, 70, "sports gym");
        Gymnast gymnast3 = new Gymnast("Milad Karimi", 23,
                "Kazakhstan", 170, 65, "sports gym");

        Footballer footballer1 = new Footballer("Mukhammedzhan Seysen", 23,
                "Kazakhstan", "goalkeeper", "FC Taraz");
        Footballer footballer2 = new Footballer("Elkhan Astanuly", 22,
                "Kazakhstan", "midfielder", "FC Ordabasy");
        Footballer footballer3 = new Footballer("Askhat Tagybergenuly", 31,
                "Kazakhstan", "midfielder", "FC Tobol");

        Swimmer swimmer1 = new Swimmer("Dmitriy Balandin", 27, "Kazakhstan", "breaststroke", 2.07);
        Swimmer swimmer2 = new Swimmer("Adilbek Musin", 22, "Kazakhstan", "butterfly", 2.09);
        Swimmer swimmer3 = new Swimmer("Alexander Varakin", 27, "Kazakhstan", "freestyle", 2.08);

        Sportsman[] sportsmen = {gymnast1, gymnast2, gymnast3, footballer1, footballer2, footballer3, swimmer1, swimmer2, swimmer3};

        OlympicGames olympicGames2016 = new OlympicGames("Rio", 2016, sportsmen);

        olympicGames2016.play();
    }
}

///// -------------------------------------------------------

