import java.util.*;

public class lab6A {
    public static void main(String[] args) {
        System.out.println("Array Index Out of Bounds Exception Example");
        
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            System.out.println("Trying to access element at index 7");
            System.out.println("Value at index 7: " + numbers[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index, maybe try counting on your fingers instead?");
        }
    }
}