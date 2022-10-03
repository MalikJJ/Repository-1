package _8_1_try_catch_version2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] listOfUsers = new User[5];

        String[] listOfEnterAgeMistake = new String[listOfUsers.length];
        int mistakeCount = 0;

        int age = 0;


        for (int i = 0; i < listOfUsers.length; i++) {
            System.out.print("\tAdding a user " +
                    (i + 1) + " of " + listOfUsers.length +
                    "\nEnter name: ");
            String name = in.next();
            System.out.print("Enter surname: ");
            String surname = in.next();
            System.out.print("Enter age: ");
            try {
                age = in.nextInt();
            } catch (Exception negativeInt) {
                age = 0;
                String enterAgeMistake = in.nextLine();
                listOfEnterAgeMistake[i] = enterAgeMistake;
                mistakeCount++;
            }
            listOfUsers[i] = new User(name, surname, age);
            System.out.println("User " +
                    (i + 1) + " of " + listOfUsers.length +
                    " added\n");
        }

//        -------------------------------------------------


        int sum = 0;
        for (int j = 0; j < listOfUsers.length; j++) {
            sum += listOfUsers[j].getAge();
        }
        System.out.println("----------------------------\n\n" +
                "Average age in the list: " +
                (double) sum / listOfUsers.length + "\n");

        if (mistakeCount != 0) {
            if (mistakeCount != listOfUsers.length) {
                System.out.println("----------------------------\n\n" +
                        "Average age in the list excluding mistakenly entered ages: " +
                        (double) sum / (listOfUsers.length - mistakeCount) + "\n");
            }
        }

//        -------------------------------------------------


        System.out.println("--------------------\n\n" +
                    "List of added users:");

        for (int k = 0; k < listOfUsers.length; k++) {
            System.out.print("\t" + (k + 1) + ") " + listOfUsers[k]);
            if (listOfEnterAgeMistake[k] == null) {
                System.out.println();
            } else {
                System.out.println(", incorrectly entered \"" +
                        listOfEnterAgeMistake[k] + "\" instead of age");
            }
        }
    }
}

//-----------------------------------------------------------------------
//-----------------------------------------------------------------------

