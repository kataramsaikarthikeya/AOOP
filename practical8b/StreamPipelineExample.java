package practical8b;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelineExample {
	public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream pipeline to filter, double, and collect
        List<Integer> doubledEvenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)        // Filter: keep only even numbers
            .map(n -> n * 2)                // Map: double each number
            .collect(Collectors.toList());  // Collect: gather results into a list

        // Print the result
        System.out.println(doubledEvenNumbers);
    }
}
