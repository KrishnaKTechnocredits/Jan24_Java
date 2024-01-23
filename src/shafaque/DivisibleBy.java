package shafaque;

public class DivisibleBy {
	void divisible(int startindex , int endindex)
	{
		System.out.println("Divisible by 7 or 13, numbers are");
		for (int num = startindex; num >= endindex ; num--)
		{
			if(num % 7 == 0)
			{
			 System.out.println(num + " is divisble by 7");
			}
			else if (num % 13 == 0)
			{
			 System.out.println(num + " is divisble by 13");
		    }
		}
	}
public static void main(String[] args)
{
	DivisibleBy divisibleby = new DivisibleBy();
	divisibleby.divisible(40,5);
}
}
