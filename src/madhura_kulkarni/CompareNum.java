package madhura_kulkarni;

class CompareNum
{
	void greaterNum(int num1, int num2)
	{
		if (num1 > num2)
		{
			System.out.println(num1+ " is greater number between "+num1+ " and "+num2);
		}
		else 
		{
			System.out.println(num2+ " is greater number between "+num1+ " and "+num2);
		}
	}
	
	void smallerNum(int num1, int num2)
	{
		if (num1 < num2)
		{
			System.out.println(num1+ " is smaller number between "+num1+ " and "+num2);
		}
		else 
		{
			System.out.println(num2+ " is smaller number between "+num1+ " and "+num2);
		}
	}
	
	public static void main(String[] args)
	{
		CompareNum comparenum= new CompareNum();
		comparenum.greaterNum(50,20);
		comparenum.smallerNum(63,43);
	}
}
