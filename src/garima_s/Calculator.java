package garima_s;

class Calculator
{	
	void add(int num1,int num2)
	{

		System.out.println("Num1 is " + num1 + ", Num2 is "+ num2 + ", Addition = "+ (num1+num2) );
	}
	
	void subtract(int num1,int num2)
	{
				System.out.println("Num1 is " + num1 +", Num2 is " + num2 +", Subtraction = "+ (num1-num2) );
	}
	void multiply(int num1,int num2)
	{
 
		System.out.println("Num1 is "+ num1 +", Num2 is "+ num2 +", Multiplication = "+ (num1*num2) );
	}
	
	void divide(int num1,int num2)
	{
		System.out.println("Num1 is "+ num1 +", Num2 is "+ num2 +", Division = "+ (num1/num2) );
	}
	
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.add(20,30);
		calculator.subtract(50,28);
		calculator.multiply(50,5);
		calculator.divide(200,10);
	}
}