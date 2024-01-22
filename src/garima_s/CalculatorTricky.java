package garima_s;

class CalculatorTricky
{	
	int totalOfAll;
	
	void add(int num1,int num2)
	{
		totalOfAll = totalOfAll + (num1 +num2);
	}
	
	void subtract(int num1,int num2)
	{
		totalOfAll= totalOfAll + (num1-num2);
	}
	void multiply(int num1,int num2)
	{
		totalOfAll = totalOfAll + (num1*num2);
	}
	
	void divide(int num1,int num2)
	{
		totalOfAll = totalOfAll + (num1/num2);
	}
	
	void sumOfAll()
	{
		System.out.println(" Total of All Functions = " + totalOfAll);
	}
	
	public static void main(String[] args)
	{
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(20,30);
		calculatorTricky.subtract(50,28);
		calculatorTricky.multiply(50,5);
		calculatorTricky.divide(200,10);
		calculatorTricky.sumOfAll();
	}
}