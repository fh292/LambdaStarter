package notion;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Using a Lambda Expression to filter and print even numbers
        numbers.forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });

        //Consumer method
        Consumer<Integer> consumer = number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        };
        consumer.accept(2);

    }
}
