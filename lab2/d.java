import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class d {

	public static void main (String args[]) throws IOException {

		int size;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of elements: ");
		try {
			size = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("Expected an int.");
			return;
		}

		int arr[] = new int[size];
		int i = 0;
		while ( i < size) {
			try {
				System.out.print("Enter #" + i + " number: ");
				arr[i] = Integer.parseInt(reader.readLine());
				i++;
			} catch (NumberFormatException e) {
				System.out.println("Expected an int");
			}
		}

		Arrays.sort(arr);
		int same = 1;
		for(int j = 1; j < arr.length; j++) {
			if(arr[j] == arr[j-1]) {
				same++;
				continue;
			} else {
				System.out.println(arr[j] + " Occoured " + same + " times.");
				same = 1;
			}
		}

	}

}

