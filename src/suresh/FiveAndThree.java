package suresh;

public class FiveAndThree {
	void m2(int startRange,int endRange)
	{
		for(int i=startRange;i<=endRange;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		FiveAndThree fiveAndThree = new FiveAndThree();
		fiveAndThree.m2(5,40);
		
	}
}
