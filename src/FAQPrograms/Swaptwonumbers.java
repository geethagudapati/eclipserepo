package FAQPrograms;

public class Swaptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		
		int b=20;
		
		int c;
		
		c=a;
		/* System.out.println("c value is "+c); */
		 
		/*
		 * a=b;
		 * 
		 * System.out.println("a value is "+a);
		 * 
		 * b=c;
		 * 
		 * System.out.println("b value is "+b);Logic 1
		 */
		
	//LOGIC2	
	/*
	 * a=a+b;//10+20
	 * 
	 * b=a-b;//30-20
	 * 
	 * a=a-b; //30-10 System.out.println("a value is "+a);
	 * 
	 * System.out.println("b value is "+b);
	 */
		
		//logic3
		
		/*
		 * a=a*b;
		 * 
		 * b=a/b;
		 * 
		 * a=a/b;
		 * 
		 * System.out.println("a value is "+a);
		 * 
		 * System.out.println("b value is "+b);
		 */
		
		a=a+b-(a=b);
		System.out.println("a value is :"+a);
		
		System.out.println("b value is :"+b);
		
		
		
		
		
		
		
		
		
	}

}
