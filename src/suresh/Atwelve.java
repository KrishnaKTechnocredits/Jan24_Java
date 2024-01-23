package suresh;

public class Atwelve 
{
	void m3(int startRange,int endRange)
	{
		for (int num=startRange;num>=endRange;num--)
		{
			if(num%7==0 )
			{
				System.out.println(num +"divisible by 7");
			}
			else if (num%13==0)
			{
					System.out.println(num+"divisible by 13");
			}
		}
	}
	public static void main(String[] args)
	{
		Atwelve atwelve = new Atwelve();
		atwelve.m3(40,5);
	}
}
