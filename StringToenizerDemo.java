package JavaExceptionQuestion;

import java.util.StringTokenizer;

public class StringToenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Pankaja Sharma";
		
		StringTokenizer stringToken = new StringTokenizer(str);
		
		 try {
	            
	            String firstToken = stringToken.nextToken(); 
	            System.out.println("First Token: " + firstToken);

	            String secondToken = stringToken.nextToken();
	            System.out.println("Second Token: " + secondToken);

	          
	            String thirdToken = stringToken.nextToken(); 
	            System.out.println("Third Token: " + thirdToken);
	        } catch (Exception e) {
	            // Handle exception when there are no more tokens
	            System.out.println("Exception: " + e.getMessage());
	            System.out.println("No more tokens available.");
	        }
	    }
}
