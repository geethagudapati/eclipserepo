package Java;

import java.util.Scanner;

public class Reverse {


	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		int rev=0;
		
		/*
		 * while(num!=0) { rev=rev*10+num%10;
		 * 
		 * num=num/10;
		 * 
		 * System.out.println("the reverse number is:"+rev);
		 * 
		 * }
		 */
		
		/*
		 * StringBuilder sbl=new StringBuilder(String.valueOf(num));
		 * 
		 * 
		 * StringBuilder rev1=sbl.reverse();
		 * System.out.println("the reverse number is:"+rev1);
		 */
		
		StringBuffer sb=new StringBuffer();
		
	sb.append(num);
	sb.reverse();
	System.out.println("the reverse number is:"+sb);
	
		
		
				
				
		
		
		
		
	}

}
