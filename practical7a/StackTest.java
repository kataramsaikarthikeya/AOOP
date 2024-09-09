package practical7a;

public class StackTest {
	 public static void main(String[] args) {
	Stack<Integer> linkedListStack = new LinkedListStack<>();
    linkedListStack.push(1);
    linkedListStack.push(2);
    linkedListStack.push(3);
    System.out.println("LinkedListStack - Peek: " + linkedListStack.peek());
    System.out.println("LinkedListStack - Pop: " + linkedListStack.pop());
    System.out.println("LinkedListStack - Is Empty: " + linkedListStack.isEmpty());
    System.out.println();

    // Test ArrayStack with String
    Stack<String> arrayStack = new ArrayStack<>();
    arrayStack.push("Apple");
    arrayStack.push("Banana");
    arrayStack.push("Cherry");
    System.out.println("ArrayStack - Peek: " + arrayStack.peek());
    System.out.println("ArrayStack - Pop: " + arrayStack.pop());
    System.out.println("ArrayStack - Is Empty: " + arrayStack.isEmpty());
    System.out.println();

    // Test ArrayStack with Character
    Stack<Character> charArrayStack = new ArrayStack<>();
    charArrayStack.push('A');
    charArrayStack.push('B');
    charArrayStack.push('C');
    System.out.println("ArrayStack - Peek: " + charArrayStack.peek());
    System.out.println("ArrayStack - Pop: " + charArrayStack.pop());
    System.out.println("ArrayStack - Is Empty: " + charArrayStack.isEmpty());
}
}


