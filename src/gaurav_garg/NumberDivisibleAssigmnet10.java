package gaurav_garg;

public class NumberDivisibleAssigmnet10 {
	
	void divide(int numb1 ,int numb2)
	{
		for(int i=numb1 ;i<=numb2 ;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
		
	public static void main(String...s)
	{
		NumberDivisibleAssigmnet10 numberdivisibleassigmnet10 = new NumberDivisibleAssigmnet10();
		numberdivisibleassigmnet10.divide(5,40);
	}
	}

