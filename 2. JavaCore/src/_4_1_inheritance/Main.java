package _4_1_inheritance;

public class Main {
    public static void main(String[] args) {
        Car someCar1 = new Car("Electric toy car", "Kids fun ride 10 kW", 5, 2022, 0);
        Car someCar2 = new Car("Karting car", "Track Pro v1", 35, 2022, 0.6);
        Car someCar3 = new Car("Morgan", "Classic 400", 160, 2022, 4.0);

        Toyota toyotaCar1 = new Toyota("Toyota", "GR 86", 180, 2022, 2.4, "Japan");
        Toyota toyotaCar2 = new Toyota("Toyota", "LC 300", 180, 2022, 4, "Japan");
        Toyota toyotaCar3 = new Toyota("Toyota", "Yaris", 180, 2022, 1.5, "Japan");

        Mercedes mercedesCar1 = new Mercedes("Mercedes", "S400", 180, 2022, 4, "S class");
        Mercedes mercedesCar2 = new Mercedes("Mercedes", "SLR", 180, 2022, 5.5, "roadster");
        Mercedes mercedesCar3 = new Mercedes("Mercedes", "C350", 180, 2022, 3.5, "C class");

        Car[] cars = {someCar1, someCar2, someCar3, toyotaCar1, toyotaCar2, toyotaCar3, mercedesCar1, mercedesCar2, mercedesCar3};

        for (int i = 0; i < cars.length; i++) {
            System.out.print(i + 1 + ". ");
            cars[i].ride();
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }
}

// -------------------------------------------------------

