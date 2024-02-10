package suresh.array;

public class CountTheDigitInTheArray {

	
	void getCoutOfDigits(String input)
	{ int count=0;
		for (int i=0;i<input.length();i++)
		{
			char ch =input.charAt(i);
			if (Character.isDigit(ch))
			{
				count=count+1;
			}
			
					
		}System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		CountTheDigitInTheArray countTheDigitInTheArray = new CountTheDigitInTheArray();
		countTheDigitInTheArray.getCoutOfDigits("H2i H3el4lo P4un2e5");
	}
}
