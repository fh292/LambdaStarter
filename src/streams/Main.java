package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 8, 1, 9, 2, 7, 4);

        System.out.println("Even Numbers Loop");

        //normal way
        System.out.println("For Loop Method");
        for (Integer number:numbers){
            if (number%2==0){
                System.out.println(number);
            }
        }

        //stream
        System.out.println("Java Stream Method");
        numbers.stream().filter(number -> number%2==0).forEach(number -> System.out.println(number));

        List<Integer> sortedAndFilteredNumbers = numbers.stream().sorted().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("Printing sorted and filtered numbers: "+sortedAndFilteredNumbers);

        List<String> strings = List.of("hello", "coded", "words");
        strings.forEach(string -> System.out.println(string));

        //Words with no letter E
        strings.stream().sorted().filter(string -> !string.contains("e")).collect(Collectors.toList()).forEach(string -> System.out.println(string));

    }
}
