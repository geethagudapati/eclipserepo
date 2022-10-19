package Java;

import java.util.Scanner;

public class largestof3numbersbyusingscannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.println("the first value of a is:"+a);
		
		int b=sc.nextInt();
		
		System.out.println("the second value of a is:"+b);
         int c=sc.nextInt();
		
		System.out.println("the third value of a is:"+c);
		
if(a>b && a>c)
			
		{
			System.out.println("the largest value is "+a);
		}
		
		if(b>a && b>c)
		{
			System.out.println("the largest value is "+b);
		}
			
		else
		{
			System.out.println("c is largest no");
		}
	}

}
