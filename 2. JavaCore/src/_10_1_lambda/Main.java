package _10_1_lambda;

public class Main {
    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("running to anonymous class");
            }
        };

        Runnable runnableLambda = () -> System.out.println("running to lambda");

        runnable1.run();
        runnableLambda.run();
    }
}
