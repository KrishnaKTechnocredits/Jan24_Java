package shafaque;

public class Assignment16 {
	int sum= 0;
	int count = 0;
	void average(int startindex , int endindex)
	{
		System.out.println("Number are:" );
		for(int num=startindex;num<= endindex;num++)
		{
			if(num%7 == 0 && num%5 == 0)
			{
			   System.out.println(num);
				count++;
				sum = sum + num;
			}
		}
			System.out.println("sum is " +sum);
			System.out.println("Found 3 numbers which are divible by 5 & 7 is " + count);
			System.out.println("Average is " + (sum/count));
			
		}
public static void main(String[] args)
{
	Assignment16 assignment16 = new Assignment16();
	assignment16.average(1,100);
}

}
