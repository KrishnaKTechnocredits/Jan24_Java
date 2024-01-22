package pramod;

public class DivisbleBy5and9Assignment12 {

	void divisbleBy5and9Number()
	{
		for(int num=100;num>5;num--)
		{
			if(num%5==0 && num%9==0)
			{
				System.out.println("Last number divisible by 5 & 9 is = "+num);
				break;
			}	
		}
	}
	
	public static void main(String args[])
	{
		DivisbleBy5and9Assignment12 divisbleBy5and9 = new DivisbleBy5and9Assignment12();
		divisbleBy5and9.divisbleBy5and9Number();
	}
}
