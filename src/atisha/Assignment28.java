package atisha;

// print sum of all the odd digits in the given string

class Assignment28 
{
	void sumOdd(String str){
		int sum=0;
		for ( int i=0; i<str.length() ;i++ )
		{
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
			{
				int digit = Character.getNumericValue(ch);
				if (digit % 2!=0)
				{
					sum= sum+digit;
				}
			}
		}
		System.out.println("sum of all the odd digits is  " +sum);
	}
	public static void main(String[] args) 
	{
		new Assignment28().sumOdd("te3ch4noc7red8its");
	}
}
