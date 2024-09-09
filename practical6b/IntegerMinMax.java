package practical6b;
import java.util.Arrays;
public class IntegerMinMax implements MinMax<Integer> {
    private Integer[] array;

    public IntegerMinMax(Integer[] array) {
        this.array = array;
    }

    @Override
    public Integer findMax() {
        return Arrays.stream(array).max(Integer::compare).orElse(null);
    }

    @Override
    public Integer findMin() {
        return Arrays.stream(array).min(Integer::compare).orElse(null);
    }
}


