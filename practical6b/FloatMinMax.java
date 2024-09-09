package practical6b;
import java.util.Arrays;
public class FloatMinMax implements MinMax<Float> {
    private Float[] array;

    public FloatMinMax(Float[] array) {
        this.array = array;
    }

    @Override
    public Float findMax() {
        return Arrays.stream(array).max(Float::compare).orElse(null);
    }

    @Override
    public Float findMin() {
        return Arrays.stream(array).min(Float::compare).orElse(null);
    }
} 


