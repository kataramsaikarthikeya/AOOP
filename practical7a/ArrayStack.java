package practical7a;

public class ArrayStack <T> implements Stack<T> {
    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayStack() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public void push(T item) {
        if (size == array.length) {
            ensureCapacity();
        }
        array[size++] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = (T) array[--size];
        array[size] = null; // Avoid memory leak
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        array = java.util.Arrays.copyOf(array, newCapacity);
    }
}


