import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class c {

	public static void main(String args[]) throws IOException {

	if (args.length == 0) {
		System.out.println("Need args.");
		return;

	}

	int size = Integer.parseInt(args[0]);

	if(size == 0) {
		System.out.println("Len cannot be 0");
		return;
	}

	int arr[] = new int[size];

	for (int i = 0; i < size; i++) {

		try {
			int num = Integer.parseInt(args[i + 1]);
			arr[i] = num;
		} catch (NumberFormatException e) {
			System.out.println("Number is not integer.");
			continue;
		}

	}

	Arrays.sort(arr);
	System.out.println("Sorted Array: " + Arrays.toString(arr));
	}

}
