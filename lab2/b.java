import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class b {


	public static void main(String args[]) throws IOException {

		int all[] = new int[args.length];
		int evenNum = 0;
		int oddNum = 0;

		for (int i = 0; i < args.length ; i++) {
		
			try {
				int num = Integer.parseInt(args[i]);
				if(num % 2 == 0) {
					all[i] = num;
					evenNum++;
				} else {
					all[i] = num;
					oddNum++;
				}
			}
			catch (NumberFormatException e) {

                                System.out.println( args[i] + " is not a integer.");
                                continue;
                        }
		}

		System.out.println("Even nums: " + evenNum);
		System.out.println("Odd nums: " + oddNum);

	}

}
