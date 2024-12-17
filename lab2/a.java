import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class a {

	public static void main (String args[]) throws IOException {
		int arr[] = new int[3];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i <= 2; i++) {
			System.out.print("Enter #"+ i + " number: ");
			arr[i] = Integer.parseInt(reader.readLine());
		}

		Arrays.sort(arr);
		System.out.println("Largest number is: " + arr[2]);
	}

}
