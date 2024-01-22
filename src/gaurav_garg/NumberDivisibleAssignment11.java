package gaurav_garg;

public class NumberDivisibleAssignment11 {

	void divide(int numb1 ,int numb2)
	{
		for(int i=numb2 ;i>=numb1 ;i--)
		{
			if(i%7==0)
			{
				System.out.println(i+" id divisible by 7");
			}else if(i%13==0)
			{
				System.out.println(i+ " id divisible by 13");
			}
		}
	}
		
	public static void main(String...s)
	{
		NumberDivisibleAssignment11 numberdivisibleassignment11 = new NumberDivisibleAssignment11();
		numberdivisibleassignment11.divide(5,40);
	}
}
