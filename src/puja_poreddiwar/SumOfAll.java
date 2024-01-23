package puja_poreddiwar;

public class SumOfAll {
	
	int sum = 0;
	
	void divisibleof5and10(int startRange, int endRange) 
	{
		for(int num = startRange; num <= endRange; num = num+1) {
			if(num%5 == 0 && num%10 == 0) {
				sum = sum + num;
			}
		}
		System.out.println(sum + " - is sum of all the number which is divisible by 5 & 10.");
			
	}
		public static void main(String[] args) 
		{
			SumOfAll sumOfAll = new SumOfAll();
			sumOfAll.divisibleof5and10(10,50);
		}
}
