package Java;

import java.util.Scanner;

public class largestnumbyusingterranryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Scanner sc=new Scanner(System.in);
		 
		 int a=sc.nextInt();
		 System.out.println("the value of a is:"+a);
		 
		 int b=sc.nextInt(); 
		 System.out.println("the value of a is:"+b);
		 
		 int c=sc.nextInt(); 
		 System.out.println("the value of a is:"+c);
		 
		
		/*
		 * int a=200; int b=500;
		 * 
		 * int c=100;
		 */
		
		int largest=a>b?a:b;
		
		largest=c>largest?c:largest;
		
	System.out.println("the laregest values is:"+largest);
		
		
		
		
		
	}

}
