package pramod;

public class Assignmnet79_PatternPrinting {

	
	void patternone()
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(""+i);
			}
			System.out.println("");
		}	
	}
	
	void patterntwo()
	{
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print("#");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String args[])
	{
		Assignmnet79_PatternPrinting assign = new Assignmnet79_PatternPrinting();
		assign.patternone();
		System.out.println("");
		System.out.println("");
		assign.patterntwo();
	}
}
