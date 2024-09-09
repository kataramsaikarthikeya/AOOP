package practical8a;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
public class LambdaSortExample1 {
	public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        strings.add("Elderberry");

        // Print the list before sorting
        System.out.println("Before sorting: " + strings);

        // Sort the list in descending order using a method reference
        strings.sort(Comparator.reverseOrder());

        // Print the list after sorting
        System.out.println("After sorting in descending order: " + strings);
    }

}
