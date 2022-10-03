package _9_1_collections_version2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Players player1 = new Players("LeBron James", 5000000, 37);
        Players player2 = new Players("LeBron Second", 4000000, 35);
        Players player3 = new Players("LeBron Third", 3000000, 30);
        Players player4 = new Players("LeBron Fourth", 2000000, 25);
        Players player5 = new Players("LeBron Fifth", 1000000, 24);
        Players player6 = new Players("LeBron Sixth", 900000, 23);
        Players player7 = new Players("LeBron Seventh", 800000, 22);
        Players player8 = new Players("LeBron Eighth", 700000, 21);
        Players player9 = new Players("LeBron Ninth", 600000, 20);
        Players player10 = new Players("LeBron Tenth", 500000, 19);

        ArrayList<Players> listOfPlayers = new ArrayList();

        listOfPlayers.add(player1);
        listOfPlayers.add(player2);
        listOfPlayers.add(player3);
        listOfPlayers.add(player4);
        listOfPlayers.add(player5);
        listOfPlayers.add(player6);
        listOfPlayers.add(player7);
        listOfPlayers.add(player8);
        listOfPlayers.add(player9);
        listOfPlayers.add(player10);

//        Players[] playersArray = {player1, player2, player3, player4, player5,
//                player6, player7, player8, player9, player10};
//
//        for (int i = 0; i < playersArray.length; i++) {
//            listOfPlayers.add(i, playersArray);
//        }


        for (int i = 0; i < listOfPlayers.size(); i++) {
            System.out.println((i + 1) + ") " + listOfPlayers.get(i));

        }

        double sumOfWages = 0;
        int sumOfPlayersAge = 0;
        for (int i = 0; i < listOfPlayers.size(); i++) {
            sumOfWages += listOfPlayers.get(i).getPrice();
            sumOfPlayersAge += listOfPlayers.get(i).getAge();
        }
        System.out.println("Average wage of players: " + (int)sumOfWages / listOfPlayers.size() + " USD");
        System.out.println("Sum of players age: " + sumOfPlayersAge + " years");
        System.out.println("Average age of players: " + (double) sumOfPlayersAge / listOfPlayers.size() + " years");
    }
}
