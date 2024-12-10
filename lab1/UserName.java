import java.util.Scanner;

public class UserName {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	String username;

	System.out.print("Enter Name: ");
	username = scanner.nextLine();

	System.out.println("Your name is " + username);
	}
}
