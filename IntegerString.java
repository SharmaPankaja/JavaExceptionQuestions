//Write a program to read a string and convert to integer using try catch block

package JavaExceptionQuestion;

import java.util.*;

public class IntegerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.next();
		try {
			System.out.println("Converted string : "+Integer.parseInt(str));
		}catch(Exception e)
		{
			System.out.println("Error..Please check the input!!");
		}

	}

}
