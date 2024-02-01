package pramod;

public class PragrammingTest1 {
	
	
	void digitSum(String str)
	{
		int sum=0;
		for(int index=0;index<str.length();index++)
		{
			char ch=str.charAt(index);
			boolean b=Character.isDigit(ch);
			if(b==true)
			{
				int temp=Character.getNumericValue(ch);
				sum =sum+temp;
			}
		}
		System.out.println("All Digit sum= "+sum);
	}
	
	void digitOddSum(String str)
	{
		int sum=0;
		for(int index=0;index<str.length();index++)
		{
			char ch=str.charAt(index);
			boolean b=Character.isDigit(ch);
			if(b==true)
			{
				int temp=Character.getNumericValue(ch);
				if(temp%2!=0)
				sum =sum+temp;
			}
		}
		System.out.println("odd number sum="+sum);
	}
	public static void main(String args[])
	{
		PragrammingTest1 pr =new PragrammingTest1();
		pr.digitSum("te3ch4nocred8its");
		pr.digitSum("technocredits");
		pr.digitOddSum("te3ch4noc3red8its");
	}

}
