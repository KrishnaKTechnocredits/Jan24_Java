package pramod;

public class DivisibleBy7Or13Assignment11 {
	
	void divisibleBy7Or13Number()
	{
		for(int num=40;num>7;num--)
		{
			if(num%13==0)
				System.out.println(num +"is divisible by 13");
			if(num%7==0)
				System.out.println(num +"is divisible by 7");
		}
	}
	
	public static void main(String args[])
	{
	DivisibleBy7Or13Assignment11 divisibleBy7Or13 = new DivisibleBy7Or13Assignment11();
	divisibleBy7Or13.divisibleBy7Or13Number();
	}
}
