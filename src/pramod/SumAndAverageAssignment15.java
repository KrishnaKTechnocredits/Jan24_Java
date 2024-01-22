package pramod;

public class SumAndAverageAssignment15 {

	void sumAndAverageNumber()
	{
		int sum=0;
		int avarage=0;
		int count=0;
		for(int num=1;num<=110;num++)
		{
			if(num%5==0 && num%7==0)
			{
			System.out.println("Numbers are= "+num);
			count++;
			sum=sum+num;
			}
		}	
		System.out.println("sum= "+sum);
		avarage=sum/count;
		System.out.println("avarage= "+avarage);
	}
	
	public static void main(String args[])
	{
		SumAndAverageAssignment15 sumAndAverage = new SumAndAverageAssignment15();
		sumAndAverage.sumAndAverageNumber();
	}
}

