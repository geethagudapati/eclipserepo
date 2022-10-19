package FAQPrograms;

public class fabnicseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int N1=0;
	
	int N2=1;
	
	int Sum=0;
	System.out.print(N1+""+N2);
	
	for(int i=2;i<11;i++)
	{
		

		Sum=N1+N2;
		
		N1=N2;
		
		N2=Sum;
		
		System.out.print(Sum);
		
		
		
	}

}



	
		
	}
