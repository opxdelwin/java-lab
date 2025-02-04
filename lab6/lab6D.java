import java.util.*;

class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class lab6D {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Insufficient arguments! Please provide 4 numbers.");
            }
            
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }
            
            System.out.println("Sum of squares of first four numbers: " + sum);
            
        } catch (CheckArgument e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integer numbers.");
        }
    }
}