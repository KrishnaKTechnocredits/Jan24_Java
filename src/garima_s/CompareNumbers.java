package garima_s;

class CompareNumbers
{
	void greaterNumber(int num1,int num2)
	{
		if(num1 >= num2)
		{
			System.out.println(num1+ " is Greater Number between " +num1+ " and " +num2);
		}
		else
		{
			System.out.println(num2+ " is Greater Number between " +num1+ " and " +num2);
		}
	}
	
	void smallerNumber(int num1, int num2)
	{
		if(num1 < num2)
		{
			System.out.println(num1+ " is Smaller Number between " +num1+ " and " +num2);
		}
		else
		{
			System.out.println(num2+ " is Smaller Number between " +num1+ " and " +num2);
		}
	}
	
	public static void main(String[] agrs)
	{
		CompareNumbers compareNumbers = new CompareNumbers();
		compareNumbers.greaterNumber(10,17);
		compareNumbers.smallerNumber(10,17);
	}
}
