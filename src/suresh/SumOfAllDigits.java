package suresh;

public class SumOfAllDigits 
{
	void printDigit(String input)
	{
		int sum=0;
		for (int i=0;i<input.length();i++)
		{
			char ch =input.charAt(i);
			boolean flg = Character.isDigit(ch);
			if(flg==true)
			{
				sum=sum+Character.getNumericValue(ch);
						
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		SumOfAllDigits sumOfAllDigits = new SumOfAllDigits();
		sumOfAllDigits.printDigit("te3ch4nocred8its");
		sumOfAllDigits.printDigit("technocredits");
	}
}
