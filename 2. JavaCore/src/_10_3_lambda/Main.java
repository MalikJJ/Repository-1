package _10_3_lambda;

public class Main {
    public static void main(String[] args) {

        Supplier supplierAnonymousClass = new Supplier() {
            @Override
            public int get() {
                return 6;
            }
        };

        Supplier supplierLambda = () -> 1;

        System.out.println("Number of lines with anonymous class: " +
                supplierAnonymousClass.get());
        System.out.println("Number of lines with lambda: " +
                supplierLambda.get());
    }
}
