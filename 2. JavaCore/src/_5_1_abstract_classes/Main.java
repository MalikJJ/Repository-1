package _5_1_abstract_classes;

public class Main {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Snickers", 50);
        Chocolate chocolate2 = new Chocolate("Twix", 60);

        Burger burger1 = new Burger("Burger King", 2, 2);
        Burger burger2 = new Burger("McDonald's", 1, 1);

        Coke coke1 = new Coke ("Coca cola", 0.5, true);
        Coke coke2 = new Coke ("Fuse tea", 0.5, false);

        Food[] listOfFood = {chocolate1, chocolate2, burger1, burger2, coke1, coke2};

        for (int i = 0; i < listOfFood.length; i++) {
            System.out.println(i + 1 + ") " +
                    listOfFood[i].getName() + " " +
                    listOfFood[i].getCalories() + " calories");
        }

        double maxCalories = 0;
        int highCalorieFoodIndex = 0;

        for (int j = 0; j < listOfFood.length; j++) {
            if (listOfFood[j].getCalories() > maxCalories) {
                maxCalories = listOfFood[j].getCalories();
                highCalorieFoodIndex = j;
            }
        }

        System.out.println("\n\t" + "The most high-calorie food is " +
                listOfFood[highCalorieFoodIndex].toString() + ", " +
                listOfFood[highCalorieFoodIndex].getCalories() +
                " calories");
    }
}

//===================================================================

