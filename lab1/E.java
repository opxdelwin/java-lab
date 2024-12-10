import java.util.Scanner;

public class E {

	public static void main(String args[]) {
		String firstName;
		String lastName;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		firstName = scanner.nextLine();
		
		System.out.print("Enter Last Name: ");
                lastName = scanner.nextLine();

		System.out.println("Your fullname is: " + lastName + " " + firstName);
	}
}
