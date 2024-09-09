package practical6b;
import java.util.Arrays;
public class StringMinMax implements MinMax<String> {
    private String[] array;

    public StringMinMax(String[] array) {
        this.array = array;
    }

    @Override
    public String findMax() {
        return Arrays.stream(array).max(String::compareTo).orElse(null);
    }

    @Override
    public String findMin() {
        return Arrays.stream(array).min(String::compareTo).orElse(null);
    }
} 


