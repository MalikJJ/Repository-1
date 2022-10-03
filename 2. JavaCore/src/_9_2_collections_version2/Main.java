package _9_2_collections_version2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BankApplication bankApplication1 = new BankApplication("Qazkom");

        bankApplication1.addAccount(new Account(1, "Almas", "First", 1000));
        bankApplication1.addAccount(new Account(2, "Almas", "Second", 1500));
        bankApplication1.addAccount(new Account(3, "Almas", "Third", 2500));
        bankApplication1.addAccount(new Account(4, "Almas", "Fourth", 3500));
        bankApplication1.addAccount(new Account(5, "Almas", "Fifth", 4000));
        bankApplication1.addAccount(new Account(6, "Almas", "Sixth", 4700));
        bankApplication1.addAccount(new Account(7, "Almas", "Seventh", 5700));
        bankApplication1.addAccount(new Account(8, "Almas", "Eighth", 5000));
        bankApplication1.addAccount(new Account(9, "Almas", "Ninth", 3300));
        bankApplication1.addAccount(new Account(10, "Almas", "Tenth", 3900));

        BankApplication bankApplication2 = new BankApplication("Zaman bank");

        bankApplication2.addAccount(new Account(1, "Bolat", "First", 3000));
        bankApplication2.addAccount(new Account(2, "Bolat", "Second", 7500));
        bankApplication2.addAccount(new Account(3, "Bolat", "Third", 6500));
        bankApplication2.addAccount(new Account(4, "Bolat", "Fourth", 7500));
        bankApplication2.addAccount(new Account(5, "Bolat", "Fifth", 9400));
        bankApplication2.addAccount(new Account(6, "Bolat", "Sixth", 5700));
        bankApplication2.addAccount(new Account(7, "Bolat", "Seventh", 4700));
        bankApplication2.addAccount(new Account(8, "Bolat", "Eighth", 6000));
        bankApplication2.addAccount(new Account(9, "Bolat", "Ninth", 2300));
        bankApplication2.addAccount(new Account(10, "Bolat", "Tenth", 900));

        BankApplication bankApplication3 = new BankApplication("Tayyab bank");

        bankApplication3.addAccount(new Account(1, "Gani", "First", 9000));
        bankApplication3.addAccount(new Account(2, "Gani", "Second", 13500));
        bankApplication3.addAccount(new Account(3, "Gani", "Third", 16500));
        bankApplication3.addAccount(new Account(4, "Gani", "Fourth", 18500));
        bankApplication3.addAccount(new Account(5, "Gani", "Fifth", 14400));
        bankApplication3.addAccount(new Account(6, "Gani", "Sixth", 8700));
        bankApplication3.addAccount(new Account(7, "Gani", "Seventh", 700));
        bankApplication3.addAccount(new Account(8, "Gani", "Eighth", 9000));
        bankApplication3.addAccount(new Account(9, "Gani", "Ninth", 9300));
        bankApplication3.addAccount(new Account(10, "Gani", "Tenth", 7900));

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.addAll(Arrays.asList(bankApplication1, bankApplication2, bankApplication3));


        Collections.sort(allBanks, new Comparator<BankApplication>() {
            @Override
            public int compare(BankApplication o1, BankApplication o2) {
                return Double.compare(o2.getAverageBalance(), o1.getAverageBalance());
            }
        });

        System.out.println();
        for (int i = 0; i < allBanks.size(); i++) {
            System.out.println((i + 1) + ". " + allBanks.get(i).getBankData());
//            System.out.println("\tAccounts:");
//            for (int j = 0; j < allBanks.get(i).getAccounts().size(); j++) {
//                System.out.println("\t\t"+ (j + 1) + ") " + allBanks.get(i).getAccounts().get(j));
//            }
//            System.out.println();
        }
    }
}
