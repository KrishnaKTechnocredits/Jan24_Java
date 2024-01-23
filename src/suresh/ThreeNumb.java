package suresh;

public class ThreeNumb 
{
	void m2(int start,int end)
	{int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for(int i=start;i<=end;i++)
		{
			if(i%3==0 && i%4==0)
			{
				count=count+1;
				System.out.println(i);
			}
			if(count==3)
			break;
			}
	
	}
	public static void main(String[]args)
	{
		ThreeNumb threeNumb =new ThreeNumb();
		threeNumb.m2(10,500);
	}
}
