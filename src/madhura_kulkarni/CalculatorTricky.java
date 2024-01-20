package madhura_kulkarni;

class CalculatorTricky
{
	
	int answer;
	
	void addition(int num1, int num2)
	{
		answer = answer + (num1 + num2);
		System.out.println(answer);
	}
	
	void subtraction(int num1, int num2)
	{
		answer = answer + (num1 - num2);
		System.out.println(answer);
	}
	
	void multiplication(int num1, int num2)
	{
		answer = answer + (num1 * num2);
		System.out.println(answer);
	}
	
	void division(int num1, int num2)
	{
		answer = answer + (num1 / num2);
		System.out.println(answer);
	}
	
	void display()
	{
		System.out.println("Answer = "+ answer);
	}
	
	public static void main(String[] args)
	{
		CalculatorTricky calculatortricky = new CalculatorTricky();
		calculatortricky.addition(40,20);
		calculatortricky.subtraction(60,30);
		calculatortricky.multiplication(20,4);
		calculatortricky.division(100,20);
		calculatortricky.display();
	}
}