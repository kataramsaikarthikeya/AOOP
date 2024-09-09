package practical7b;
import java.util.Comparator;
public class PriorityQueueTest {
	public static void main(String[] args) {
        // Test PriorityQueue with Integers
        PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.reverseOrder());
        intQueue.insert(5);
        intQueue.insert(10);
        intQueue.insert(3);
        System.out.println("Integer Priority Queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.remove());
        }
        System.out.println();

        // Test PriorityQueue with Doubles
        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.reverseOrder());
        doubleQueue.insert(5.5);
        doubleQueue.insert(10.1);
        doubleQueue.insert(3.3);
        System.out.println("Double Priority Queue:");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.remove());
        }
        System.out.println();

        // Test PriorityQueue with Strings
        PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
        stringQueue.insert("apple");
        stringQueue.insert("banana");
        stringQueue.insert("cherry");
        System.out.println("String Priority Queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.remove());
        }
    }
}
