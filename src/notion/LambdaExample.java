package notion;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using a regular method to filter and print even numbers
        filterAndPrintEvenNumbers(numbers);
    }

    // Regular method to filter and print even numbers
    public static void filterAndPrintEvenNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}