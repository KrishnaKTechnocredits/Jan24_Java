package pramod;

public class EvenNumberAssignment9 {

	
	void evenNumber()
	{
		for(int num=10 ;num<15;num++)
		{
			if(num%2==0)
			{
				System.out.println("Even numbers are="+num);
			}
		}
	}
	
	public static void main(String args[])
	{
		EvenNumberAssignment9 evenNumberAssignment9 = new EvenNumberAssignment9();
		evenNumberAssignment9.evenNumber();
		
	}
}
