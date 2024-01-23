package pramod;

class Assignment_2_CalculatorTricky
{
	int sum ;
	
	void addition(int num1, int num2)
	{
		sum=sum+(num1+num2);
	}
	
		void substraction(int num1, int num2)
	{
		sum=sum+(num1-num2);
	}
	
		void multiplication(int num1, int num2)
	{
		sum=sum+(num1*num2);
	}
	
		void division(int num1, int num2)
	{
		sum=sum+(num1/num2);
	}
	
	void sumofall()
	{
		System.out.println("Sum of all="+sum);
	}
		
	public static void main(String args[])
	{
		Assignment_2_CalculatorTricky c1 = new Assignment_2_CalculatorTricky();
		
		c1.addition(1000,500);
		c1.substraction(50,20);
		c1.multiplication(50,5);
		c1.division(200,10);
		c1.sumofall();
	}
}