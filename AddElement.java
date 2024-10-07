//Create an integer array of size n and read the elements from the user .
//Add an exception handling block to print the value at nth position of the array

package JavaExceptionQuestion;

import java.util.*;

public class AddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		Scanner sc = new Scanner(System.in);
		arr = new int[10];

		try {
			System.out.println("Enter array elements..");
			for (int i = 0; i < 3; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter key to search");
			int key = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				if (key == arr[i])
					System.out.println("Value : " + arr[i] + " at position : " + key);
			}
		} catch (InputMismatchException e) {
			System.out.println("Error...");
		}

	}

}
