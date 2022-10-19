package Java;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digits=60123;
		
		int sum=0;
		
		int count=0;
		
		while(digits>0)
		
		{
			sum=sum+digits%10;
			
			digits=digits/10;
			
			count++;
			
			
			
		}
		
		System.out.println("the sum values is:"+sum);
		
	}

}

