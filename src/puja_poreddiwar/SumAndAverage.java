package puja_poreddiwar;

public class SumAndAverage {
	
	int sum=0;
	int count;
	int average;
	
	void average(int startRange, int endRange) 
	{
		System.out.println("numbers which are divible by 5 & 7");
		for(int num = startRange; num <= endRange; num++)
		{
			if(num%5 == 0 && num%7 == 0)
			{
				count++;
				sum = sum + num;
				average=sum/count;
				System.out.println(num);
			}
		}
		System.out.println("sum is : " + sum);
		System.out.println("average is : " + average);
	}
	
	public static void main(String[] args)
	{
		SumAndAverage sumAndAverage = new SumAndAverage();
		sumAndAverage.average(1,110);
	}
}
