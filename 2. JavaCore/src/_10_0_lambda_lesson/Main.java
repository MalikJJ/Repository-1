package _10_0_lambda_lesson;

public class Main {
    public static void main(String[] args) {
        MathOperation operation = (a, b) -> a + b;
        System.out.println(operation.operate(30, 40));
        System.out.println(operation.operate(100, 200));

//                                      instead of
//        MathOperation operationSumAnonymousClass = new MathOperation() {
//            @Override
//            public double operate(double a, double b) {
//                return a + b;
//            }
//        };
//        System.out.println(operationSumAnonymousClass.operate(30, 40));
//        System.out.println(operationSumAnonymousClass.operate(100, 200));

        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation subtractOperation = (a, b) -> a - b;
        MathOperation multiplyOperation = (a, b) -> a * b;
        MathOperation divisionOperation = (a, b) -> a / b;

        System.out.println();
        System.out.println(sumOperation.operate(100, 25));
        System.out.println(subtractOperation.operate(100, 25));
        System.out.println(multiplyOperation.operate(100, 25));
        System.out.println(divisionOperation.operate(100, 25));
    }
}
