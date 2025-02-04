import java.util.Scanner;
public class lab6e {
    public static void main(String args[]) throws StackOverflowException, StackUnderflowException {

        Stack stk = new Stack(3);
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter the number to push");
                    int num = sc.nextInt();
                    try {
                        stk.push(num);
                    } catch(StackOverflowException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Popped element: " + stk.pop());
                    } catch(StackUnderflowException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}

class Stack {
    int max;
    int[] array;
    int top = -1;

    public Stack(int max){
        this.max = max;
        this.array = new int[this.max];
    }

    int pop() throws StackUnderflowException {
        if(this.top == -1) {
            throw new StackUnderflowException("Stack is empty");
        }
        int nym = this.array[this.top];
        this.top=this.top-1;
        return nym;
    }

    void push(int num) throws StackOverflowException {
        if (this.top == this.max-1) {
            throw new StackOverflowException("Stack is full");
        }
        this.top=this.top+1;
        this.array[this.top] = num;
    }
}

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}