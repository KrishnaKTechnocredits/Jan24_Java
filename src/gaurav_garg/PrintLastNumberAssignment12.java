package gaurav_garg;

public class PrintLastNumberAssignment12 {
	
	int lastnumber;
	
	void divide(int numb1 ,int numb2)
	{	
		
		for(int i=numb1 ;i<=numb2 ;i++)
		{
			if(i%5==0 && i%9==0)
			{
				
				lastnumber=i;	
			}
		}
		System.out.println(lastnumber);		
	}
		
	public static void main(String...s)
	{
		PrintLastNumberAssignment12 printlastnumberassignment12 = new PrintLastNumberAssignment12();
		printlastnumberassignment12.divide(5,100);
	}
}
