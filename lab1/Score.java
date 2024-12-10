import java.util.Scanner;

public class Score {
	public static void main(String args[]) {
		int score;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your score: ");
		score = scanner.nextInt();

		if(score < 0 || score > 100) {
			System.out.println("Invalid Score");
			return;
		}

		switch(score) {
			case 90,91,92,93,94,95,96,97,98,99,100:
				System.out.println("A - Excellent");
				break;

			case 80,81,82,83,84,85,86,87,88,89:
				System.out.println("B - Very Good");
                                break;

			case 70,71,72,73,74,75,76,77,78,79:
				System.out.println("C - Good");
                                break;

			case 60, 61,62,63,64,65,66,67,68,69:	
				System.out.println("D - Satisfactory");
                                break;

			case 50,51,52,53,54,55,56,57,58,59:
				System.out.println("E - Work Hard");
                                break;
		
			case 40,41,42,43,44,45,46,47,48,49:
				System.out.println("F - Just Passed");
                                break;
			default:
				System.out.println("Failed");
                                break;
		}
	}
}
