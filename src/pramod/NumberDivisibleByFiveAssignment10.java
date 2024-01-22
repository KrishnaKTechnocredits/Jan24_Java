package pramod;

public class NumberDivisibleByFiveAssignment10 {

	
	void divisibleByFive()
	{
		for(int num=5; num<40 ; num++)
		{
			if(num%3==0 && num%5==0)
			{
				System.out.println("Divisible by 5 & 3, numbers are="+num);
			}
		}
	}
	public static void main(String args[]) {
		NumberDivisibleByFiveAssignment10 numberdivisiblebyfive = new NumberDivisibleByFiveAssignment10();
		numberdivisiblebyfive.divisibleByFive();
	}
}
