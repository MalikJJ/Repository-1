package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Item> items = new ArrayList<>();

    private static int id = 6;

    static {
        items.add(new Item(1, "iPhone 13 Pro Max", 450000, 10));
        items.add(new Item(2, "Xiaomi RedMi Note 8", 82000, 20));
        items.add(new Item(3, "Oppo 3 Model X", 350000, 15));
        items.add(new Item(4, "Macbook Pro 13 M1", 750000, 15));
        items.add(new Item(5, "Asus TuF Gaming", 340000, 7));
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void addItem(Item item) {
        item.setId(id);
        id++;
        items.add(item);
    }

    public static Item getItem(int id) {
        return items.stream().filter(item -> item.getId() == id).findFirst().get();
    }
}
