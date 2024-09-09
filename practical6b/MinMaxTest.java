package practical6b;
public class MinMaxTest {
    public static void main(String[] args) {
        // Test Integer
        Integer[] intArray = {3, 1, 4, 1, 5, 9};
        MinMax<Integer> intMinMax = new IntegerMinMax(intArray);
        System.out.println("Integer Array - Max: " + intMinMax.findMax());
        System.out.println("Integer Array - Min: " + intMinMax.findMin());

        // Test String
        String[] strArray = {"apple", "orange", "banana", "grape"};
        MinMax<String> strMinMax = new StringMinMax(strArray);
        System.out.println("String Array - Max: " + strMinMax.findMax());
        System.out.println("String Array - Min: " + strMinMax.findMin());

        // Test Character
        Character[] charArray = {'z', 'a', 'b', 'd'};
        MinMax<Character> charMinMax = new CharacterMinMax(charArray);
        System.out.println("Character Array - Max: " + charMinMax.findMax());
        System.out.println("Character Array - Min: " + charMinMax.findMin());

        // Test Float
        Float[] floatArray = {3.14f, 1.59f, 2.65f, 5.89f};
        MinMax<Float> floatMinMax = new FloatMinMax(floatArray);
        System.out.println("Float Array - Max: " + floatMinMax.findMax());
        System.out.println("Float Array - Min: " + floatMinMax.findMin());
    }
}


