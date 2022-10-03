package _11_0_Stream_API_lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 5, 3, -23, 232, 3, 99, -5, -53, 98};
        long positiveNums = IntStream.of(nums).filter(n -> n > 0).count();
        System.out.println(positiveNums);

        System.out.println();

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Ilyas", "Aybek", "Amanzhan", "Assylkhan", "Azamat");
        names.stream()
                .filter(s -> s.length() > 5)
                .forEach(s -> System.out.println(s));

        System.out.println();

        ArrayList<Item> items = new ArrayList<>();
        Collections.addAll(items,
                new Item("iPhone", "13 Pro Max", 1200),
                new Item("XIAOMI", "Redmi Note 8", 300),
                new Item("Samsung", "Galaxy Note 18", 800),
                new Item("NOKIA", "3110", 100)
        );
        Stream<Item> itemStream = items.stream();
        Stream<String> stringStream = itemStream.map(item -> item.getName());
        stringStream.forEach(item -> System.out.println(item));

        System.out.println();

        items.stream()
                .map(item -> item.getName())
                .forEach(item -> System.out.println(item));

        System.out.println();

        items.stream()
                .flatMap(item -> Stream.of(
                        item.getName() + " " + item.getModel() + " for " + item.getPrice() + " USD",
                        item.getName() + " " + item.getModel() + " for " + item.getPrice() * 420 + " KZT"
                ))
                .forEach(item -> System.out.println(item));

    }
}
