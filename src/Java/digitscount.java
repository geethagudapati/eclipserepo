/**
 * 
 */
package Java;

public class digitscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int countdigits=123258635;
	
	int count=0;
	
	while(countdigits>0)
	{
		countdigits=countdigits/10;
		count++;
		
	}
		
	System.out.println("the values of count is:"+count);
	}
	}