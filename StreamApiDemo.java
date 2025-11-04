import java.util.*;
// import java.util.List;
import java.util.stream.*;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> names = Arrays.asList("Shravan", "Loki", "mandy");

        numbers.stream()
        .filter(n -> n%2==0)
        .forEach(System.out::println);

        List<String> upperCaseNames = names.stream()
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(upperCaseNames);
    }
}
