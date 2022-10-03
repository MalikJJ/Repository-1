package _11_1_Stream_API;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, 1, 5, 3, -23, 232, 3, 99, -5, -53, 98, 15, 99999, 12, 27);

        long divisibleBy3 = integerArrayList.stream()
                .filter(num -> num % 3 == 0).count();

        System.out.println("There are " + divisibleBy3 +
                " numbers in the list, that are divisible by three without a remainder." +
                "\n\tThese are the following numbers:");

        integerArrayList.stream()
                .filter(num -> num % 3 == 0)
                .forEach(num -> System.out.print(num + "\t"));

    }
}
