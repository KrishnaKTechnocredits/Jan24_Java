package suresh;

public class Evn {
	void m1(int startRange, int endRange)
	{
		for (int i=startRange;i<=endRange;i++)
		{	
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}	
	
	public static void main(String[] args)
	{
		 Evn evn = new Evn();
		evn.m1(10,15);
	}			
}


