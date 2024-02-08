package pramod;

class Assignment_1_Calculator
{
	
	void addition(int num1, int num2)
	{
		int num3=num1+num2;
		System.out.println("addition = "+num3);
	}
	
		void substraction(int num1, int num2)
	{
		int num3=num1-num2;
		System.out.println("substraction = "+num3);
	}
	
		void multiplication(int num1, int num2)
	{
		int num3=num1*num2;
		System.out.println("multiplication = "+num3);
	}
	
		void division(int num1, int num2)
	{
		int num3=num1/num2;
		System.out.println("division = "+num3);
	}
	
	
	public static void main(String args[])
	{
		Assignment_1_Calculator c1 = new Assignment_1_Calculator();
		
		c1.addition(20,30);
		c1.substraction(50,22);
		c1.multiplication(50,5);
		c1.division(200,10);
	}
}