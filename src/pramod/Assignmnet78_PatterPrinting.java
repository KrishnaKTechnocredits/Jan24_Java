package pramod;

//*
//**
//***
//****
//
//1
//1 2
//1 2 3 
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//
//1
//2 3
//4 5 6
//7 8 9 10


public class Assignmnet78_PatterPrinting {

	
	void starPattern()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}
	
	void secondPattern()
	{
		for(int i=1;i<7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(""+j);
			}
			System.out.println("");
		}
		
	}
	
	
	void thirdPattern()
	{
		int k=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(""+k);
				k++;
			}
			System.out.println("");
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		Assignmnet78_PatterPrinting assign = new Assignmnet78_PatterPrinting();
		assign.starPattern();
		System.out.println("");
		assign.secondPattern();
		System.out.println("");
		assign.thirdPattern();
		
	}
	
	
}
