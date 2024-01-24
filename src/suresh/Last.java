package suresh;

public class Last 
{
	
		void m1(int start,int end)
		{
				for (int num=start;num>=end;num--)
			{
				if (num%5==0&& num%9==0)
				{
					System.out.println(" Last number divisible by 5 & 9 is "+ num);
					break;
				}
			}
		}
		public static void main(String[] args)
		{
			Last last=new Last();
			last.m1(100,5);
		}
}