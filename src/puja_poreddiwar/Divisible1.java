package puja_poreddiwar;

public class Divisible1 {
    
	int num;
	void divisibleof3and5(int startRange, int endRange)
	{
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int index = 1;index <= 40;index = index+1) 
		{
			if(index%3 == 0 && index%5 == 0) 
			{
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args) {
		Divisible1 divisible1 = new Divisible1();
		divisible1.divisibleof3and5(5,40);
	}

}
