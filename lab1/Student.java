import java.util.Scanner;

public class Student {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String name;
		String branch;
		String section;
		int roll_num;

		for (int i = 0; i < 3; i++) {

		if(i != 0) {
			scanner.nextLine();
		}

		System.out.print("Enter yo name: ");
		name = scanner.nextLine();

		System.out.print("Enter yo section: ");
                section = scanner.nextLine();

		System.out.print("Enter yo branch: ");
                branch = scanner.nextLine();

		System.out.print("Enter yo roll number: ");
                roll_num = scanner.nextInt();


		System.out.println("Name: " + name);
		System.out.println("Section: " + section);
		System.out.println("Branch: " + branch);
		System.out.println("Roll Num: " + roll_num);
	
		}
	}
}
