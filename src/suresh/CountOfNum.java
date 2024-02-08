package suresh;

public class CountOfNum 
{
	void countNumbers()
	{
		int num=1;
		int count=0;
		int sum=0;
		while (sum<=150)
		{
			if (num%6==0)
			{
				sum=sum+num;
				count++;
				
			}num++;
		}System.out.println("minmum numbers required for the sum 150 is "+count);
	}
	public static void main(String[] args)
		{
			CountOfNum countofNum = new CountOfNum();
			countofNum.countNumbers();
		}
		
	}
