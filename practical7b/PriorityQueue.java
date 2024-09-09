package practical7b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class PriorityQueue <T> {
    private List<T> heap;
    private Comparator<T> comparator;

    public PriorityQueue(Comparator<T> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    public void insert(T element) {
        heap.add(element);
        siftUp(heap.size() - 1);
    }

    public T remove() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        T result = heap.get(0);
        T lastElement = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            siftDown(0);
        }
        return result;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void siftUp(int index) {
        T element = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (comparator.compare(element, parent) <= 0) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, element);
    }

    private void siftDown(int index) {
        int size = heap.size();
        T element = heap.get(index);
        while (index < size / 2) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int largestChildIndex = leftChildIndex;

            if (rightChildIndex < size && comparator.compare(heap.get(rightChildIndex), heap.get(leftChildIndex)) > 0) {
                largestChildIndex = rightChildIndex;
            }

            if (comparator.compare(element, heap.get(largestChildIndex)) >= 0) {
                break;
            }

            heap.set(index, heap.get(largestChildIndex));
            index = largestChildIndex;
        }
        heap.set(index, element);
    }
}


