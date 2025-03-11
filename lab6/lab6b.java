import java.util.Scanner;

public class lab6b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = sc.nextDouble();
        try {
            Number num = new Number(n);
        } catch (NegativeNumberException e) {
            System.out.println("Error Type: NegativeNumberException");
            System.out.println("Error Message: " + e.getMessage());
            return;
        }
    }
}


class Number {
    double n;

    public Number(double n) throws NegativeNumberException {
        if(n < 0.0) {
            throw new NegativeNumberException("Negative Numbers are not allowed.");
        }
        this.n = n;
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message)
    }
}