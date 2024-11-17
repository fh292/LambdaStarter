package examples;


public class Main {
    public static void main(String[] args) {
        Calculator plusCalculator = ((x, y) -> x + y);
        int result = plusCalculator.calculate(5, 9);
        System.out.println("5 + 9 = " + result);

        Calculator multiplyCalculator = ((x, y) -> x * y);
        int result2 = multiplyCalculator.calculate(5, 9);
        System.out.println("5 * 9 = " + result2);

        HelloFunction helloFunction = msg -> System.out.println("Hello " + msg);
        helloFunction.hello("CODED");

        Calculator2 doubleCalculator = number -> System.out.println("7 * 7 = " + number * 2);
        doubleCalculator.calculate(7);

        TestingNumber testingNumber = number -> number > 7;
        boolean result3 = testingNumber.testNumber(4);
        System.out.println("Is 7 > 4? " + result3);
    }
}
