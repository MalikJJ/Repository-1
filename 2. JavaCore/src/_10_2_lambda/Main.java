package _10_2_lambda;

public class Main {
    public static void main(String[] args) {

        Consumer consumerAnonymousClass = new Consumer() {
            @Override
            public void accept(int x) {
                System.out.println("Price for consumers from anonymous class: " + x);
            }
        };

        Consumer consumerLambda = x -> System.out.println("Price for of consumers from lambda: " + x);

        consumerAnonymousClass.accept(15);
        consumerLambda.accept(14);
    }
}
