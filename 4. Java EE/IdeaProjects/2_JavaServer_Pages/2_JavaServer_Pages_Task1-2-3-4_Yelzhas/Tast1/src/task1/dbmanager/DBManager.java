package task1.dbmanager;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Item> allProducts=new ArrayList<>();
    private static Long id=5l;

    static {
            allProducts.add(new Item(1l,"Iphone 14 max",960000,7));
            allProducts.add(new Item(2l,"Samsung S11 Pro Max",450000,15));
            allProducts.add(new Item(3L,"XIAOMI REDMI NOTE 8 PRO",240000,26));
            allProducts.add(new Item(4l,"MacBook Pro",1500000,4));
    }

    public static void addItems(Item item){
        item.setId(id);
        id++;
        allProducts.add(item);
    }

    public static ArrayList<Item> getAllItems(){
        return allProducts;
    }







}
