package _10_4_lambda;

public class Main {
    public static void main(String[] args) {

        Consumer consumerAnonymousClass = new Consumer() {
            @Override
            public int apply(int x) {
                return x * 100;
            }
        };

        Consumer consumerLambda = (x) -> x * 10;
        System.out.println(consumerAnonymousClass.apply(14));
        System.out.println(consumerLambda.apply(15));
    }
}
