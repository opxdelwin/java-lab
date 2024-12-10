import java.util.Scanner;

public class D {
	public static void main(String args[]) {
		int input;
		int copy;
		int pTemp = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Input Number: ");
		input = sc.nextInt();
		copy = input;

		while(input != 0) {
			int last = input % 10;
			pTemp = pTemp * 10;
			pTemp = pTemp + last;
			input = input / 10;
		}

		if(pTemp == copy) {
			System.out.println("Palindrome");
			return;
		}

		System.out.println("Nah");
	}
}
