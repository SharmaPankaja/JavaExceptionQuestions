//Write a JAVA program to create a method that takes a string as input and throws an 
//exception if the string does not contain vowels.


package JavaExceptionQuestion;

import java.util.Scanner;

public class StringWithoutVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Pankaja";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str = sc.next();
		try {
			for(int i=0;i<str.length();i++)
			{
				if(!str.equalsIgnoreCase("a") || !str.equalsIgnoreCase("e") || !str.equalsIgnoreCase("i") || !str.equalsIgnoreCase("o") || !str.equalsIgnoreCase("u"))
					System.out.println("Vowels not alloweed...");
				    
			    else
			    	System.out.println("Succesful..");
			}
			System.out.println("Converted string : "+Integer.parseInt(str));
		}catch(Exception e)
		{
			System.out.println("Error..Please check the input!!");
		}


	}

}