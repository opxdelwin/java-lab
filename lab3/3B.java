import java.util.Scanner;



public class Area {
	// void calcCircleAndSquare(double r);
	// void calcTriangle(double base, double height);

	public static void main(String args[]) {
		System.out.print("Enter dimensions: ");
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		String arr[] = input.split(" ");

		if(arr.length == 1) {
			double a = Double.parseDouble(arr[0]);
			calcCircleAndSquare(a);
		}
		else if (arr.length == 2) {
			double a = Double.parseDouble(arr[0]);
			double b = Double.parseDouble(arr[1]);
			calcTriangle(a,b);
		}
	}

	static void calcCircleAndSquare(double r) {

		System.out.println("Circle: " + (2 * 3.14 * r) + "\nSquare: " + (4 * r));
	}

	static void calcTriangle(double base, double height) {

		System.out.println("Triangle: " + (0.5 * base * height));

	}
}
