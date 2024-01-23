package suresh;

public class SumAll
{
	void m1(int start,int end )
	{ int ans=0;
	for(int i= start;i<=end;i++)
		{
			if (i%5==0 && i%10==0)
			{
			//System.out.println(i);
			ans=ans+i;
			}	
		}
	System.out.println(" Expected sum is "+ans);
			
	}
	
		public static void main(String[] args)
		{
			SumAll sumAll = new SumAll();
			sumAll.m1(5,50);
		}
}
	
	