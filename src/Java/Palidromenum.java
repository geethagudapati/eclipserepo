package Java;

import java.util.Scanner;

public class Palidromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("the number is"); int num = sc.nextInt();
		 * 
		 * StringBuffer sb = new StringBuffer(String.valueOf(num));
		 * 
		 * StringBuffer rev = sb.reverse();
		 * 
		 * System.out.println("the reverse value is:" + rev);
		 * 
		 * if (rev == sb) { System.out.println("number is palindrome number"); } else {
		 * System.out.println("number not palindrome number:"); }
		 */
		int r,sum=0,temp;
		
		int n=454;
		
		temp=n;
		
		while(n>=0)
		{
			  r=n%10;  //getting remainder

			  sum=(sum*10)+r;

			  n=n/10;
		}
		
		if(temp==sum)

			  System.out.println("palindrome number ");
	
			else
			{

			  System.out.println("not palindrome");

			
}
	}
}


	

