package pramod;

public class First3NumbersDivisibleBy3And4Assignment14 {
	void first3NumbersDivisibleBy3And4Number()
	{
		int count=0;
		for(int num=10;num<=500;num++)
		{
			if(num%3==0 && num%4==0)
			{
			count++;
			System.out.println("First 3 numbers divisible by 3 and 4 is= "+num);
			}
			if(count>=3)
				break;
		}	
	}
	
	public static void main(String args[])
	{
		First3NumbersDivisibleBy3And4Assignment14 first3NumbersDivisibleBy3And4 = new First3NumbersDivisibleBy3And4Assignment14();
		first3NumbersDivisibleBy3And4.first3NumbersDivisibleBy3And4Number();
	}
}

