package pramod;

public class DivisibleBy5And10Assignment13 {
	void divisbleBy5and10Number()
	{
		int sum=0;
		for(int num=10;num<=50;num++)
		{
			if(num%5==0 && num%10==0)
			sum=sum+num;
		}
		System.out.println("Sum is= "+sum);
	}
	
	public static void main(String args[])
	{
		DivisibleBy5And10Assignment13 divisibleBy5And10 = new DivisibleBy5And10Assignment13();
		divisibleBy5And10.divisbleBy5and10Number();
	}
}
