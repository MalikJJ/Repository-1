package _5_3_abstract_classes;

import java.text.DecimalFormat;

public class Main {
    public static void main (String[] args) {
        FerrariEngine ferrariEngine1 = new FerrariEngine(1.6, 6, 1400);
        FerrariEngine ferrariEngine2 = new FerrariEngine(2.4, 8, 3100);
        FerrariEngine ferrariEngine3 = new FerrariEngine(3.0, 10, 5500);
        FerrariEngine ferrariEngine4 = new FerrariEngine(4.0, 8, 5950);
        FerrariEngine ferrariEngine5 = new FerrariEngine(5.0, 10, 9400);

        RenaultEngine renaultEngine1 = new RenaultEngine(1.6, 6, 1450, 10);
        RenaultEngine renaultEngine2 = new RenaultEngine(2.4, 8, 3150, 10);
        RenaultEngine renaultEngine3 = new RenaultEngine(3.0, 10, 5550, 10);
        RenaultEngine renaultEngine4 = new RenaultEngine(4.0, 8, 5600, 10);
        RenaultEngine renaultEngine5 = new RenaultEngine(5.0, 8, 7350, 10);

        Engine[] listOfEngines = {ferrariEngine1, ferrariEngine2, ferrariEngine3, ferrariEngine4, ferrariEngine5,
                renaultEngine1, renaultEngine2, renaultEngine3, renaultEngine4, renaultEngine5};

        for (int i = 0; i < listOfEngines.length; i++) {
            System.out.println((i + 1) + ") " +
                    listOfEngines[i] + " max speed " +
                    new DecimalFormat("0").
                            format(listOfEngines[i].getMaxSpeed()) + " km/h");
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }
}

//------------------------------------------------------------------------------

