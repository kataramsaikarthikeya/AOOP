package practical6b;
import java.util.Arrays;
public class CharacterMinMax implements MinMax<Character> {
    private Character[] array;

    public CharacterMinMax(Character[] array) {
        this.array = array;
    }

    @Override
    public Character findMax() {
        return Arrays.stream(array).max(Character::compare).orElse(null);
    }

    @Override
    public Character findMin() {
        return Arrays.stream(array).min(Character::compare).orElse(null);
    }
}


