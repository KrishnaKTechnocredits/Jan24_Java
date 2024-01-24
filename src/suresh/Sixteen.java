package suresh;

public class Sixteen 
{
	void m1(int start,int end)
	{
		int sum=0;
		int count=0;
		for (int i= start;i<=end;i++)
		{
			if(i%5==0 && i%7==0)
			{
				System.out.println(i);
				sum=sum+i;
				count=count+1;
			}
		}
				System.out.println("sum is "+sum);
				System.out.println("Avarage is "+sum/count);
	}	
	public static void main(String[] args)
	{
		Sixteen sixteen =new Sixteen();
		sixteen.m1(1,110);
	}
}
