package _8_1_try_catch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] listOfUsers = new User[5];

        int age = 0;
        int mistakeCount = 0;

        for (int i = 0; i < listOfUsers.length; i++) {
            System.out.println("\tAdding a user " + (i + 1) + " of " + listOfUsers.length +
                    "\nEnter name:");
            String name = in.next();
            System.out.println("Enter surname:");
            String surname = in.next();
            System.out.println("Enter age:");
            try {
                age = in.nextInt();
            } catch (Exception e) {
                age = 0;
                in.next();
                mistakeCount++;
            }
            listOfUsers[i] = new User(name, surname, age);
            System.out.println("User " + (i + 1) + " of " + listOfUsers.length + " added\n");
        }


        int sum = 0;
        for (int j = 0; j < listOfUsers.length; j++) {
            sum += listOfUsers[j].getAge();
        }
        System.out.println("----------------------------\n\n" +
                "Average age in the list: " +
                (double) sum / listOfUsers.length + "\n");

        if (mistakeCount != listOfUsers.length) {
            if (mistakeCount != 0) {
                System.out.println("----------------------------\n\n" +
                        "Average age in the list excluding mistakenly entered ages: " +
                        (double) sum / (listOfUsers.length - mistakeCount) + "\n");
            }
        }


        System.out.println("--------------------\n\n" +
                    "List of added users:");

        for (int k = 0; k < listOfUsers.length; k++) {
            System.out.print("\t" + (k + 1) + ") " + listOfUsers[k] + "\n");
        }
    }
}

//------------------------------------------------------------------------

