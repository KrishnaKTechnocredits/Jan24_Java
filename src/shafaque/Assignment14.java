package shafaque;

public class Assignment14 {
	int sum = 0;

	void div5_10(int startindex, int endindex)
	{
		for (int num = startindex ; num <= endindex ; num++)
		{
			if(num % 5 == 0 && num % 10 == 0)
			{
			   sum = sum + num;
			}
		}
		System.out.println("Expected sum is " + sum);
	}
public static void main(String[] args)
{
	Assignment14 assignment14 = new Assignment14();
	assignment14.div5_10(10,50);
	
	
}

}
