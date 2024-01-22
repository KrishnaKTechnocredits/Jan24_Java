package puja_poreddiwar;

public class FindLastNumber {
	
	int count;

	void disibleby5and9(int startRange, int endRange)
	{
		for(int num=startRange; num >=endRange ; num--) 
		{
			if(num%9 == 0 && num%5 == 0)
			{
				System.out.println("Last number divisible by 5 & 9 is : " + num);
				break;
			}
		}
	}
	
	public static void main(String[] args)
	{
		FindLastNumber findLastnumber = new FindLastNumber();
		findLastnumber.disibleby5and9(100,5);
	}
	
}
