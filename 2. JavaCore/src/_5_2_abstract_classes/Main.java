package _5_2_abstract_classes;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
    public static void main (String[] args) {
        SphereGold sphereGold1 = new SphereGold(1);
        SphereGold sphereGold2 = new SphereGold(3);
        SphereGold sphereGold3 = new SphereGold(10);

        CubeGold cubeGold1 = new CubeGold(1);
        CubeGold cubeGold2 = new CubeGold(6);
        CubeGold cubeGold3 = new CubeGold(20);

        GoldShape[] listOfGoldShapes = {sphereGold1, sphereGold2, sphereGold3, cubeGold1, cubeGold2, cubeGold3};

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(' ');
        symbols.setDecimalSeparator('.');

        for (int i = 0; i < listOfGoldShapes.length; i++) {
            System.out.println(i + 1 + ") " +
                    listOfGoldShapes[i] + ", price " +
                    new DecimalFormat("###,###.00", symbols).
                            format(listOfGoldShapes[i].getPrice()) +" USD");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }
}

//-------------------------------------------------------------------------

