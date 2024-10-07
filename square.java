//Write a program to calculate the square value of any number given by the user .
//Add an exception handling block to check whether the user enter letters instead of numbers

package JavaExceptionQuestion;

import java.util.*;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);

		
        try {
        	System.out.println("Enter the number : ");
    		num=sc.nextInt();
			int result = num*num;
			System.out.println("Square is : "+result);
		}catch(InputMismatchException e)
        {
			System.out.println("Error : Only numbers accepted,Check your key value...");
        }
	}

}
