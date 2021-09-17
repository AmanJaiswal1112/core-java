package java8.functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Check_Predicate_FI {
    public static void main(String[] args) {

        // create a list of strings
        List<String> names =
                Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2");

        // declare the predicate type as string and use
        // lambda expression to create object

        Predicate<String> stringPredicate = (s -> s.startsWith("G"));

        // Iterate through the list
        for (String s :names) {
            // call the test method
            if(stringPredicate.test(s))
                System.out.println(s);
        }


    }
}
