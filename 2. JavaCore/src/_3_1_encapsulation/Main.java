package _3_1_encapsulation;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Nokia", "N97", 155000);
        Phone phone2 = new Phone("Nokia", "3210", 15000);
        Phone phone3 = new Phone("iPhone", "6", 175000);
        Phone phone4 = new Phone("Samsung", "Galaxy S6 edge", 180000);
        Phone phone5 = new Phone("HTC", "One", 185000);
        System.out.println(phone1.getData());
        System.out.println(phone2.getData());
        System.out.println(phone3.getData());
        System.out.println(phone4.getData());
        System.out.println(phone5.getData());
    }
}
