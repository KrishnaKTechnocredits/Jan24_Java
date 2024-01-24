package puja_poreddiwar;

public class Divisible3 {
	
	int count;
	void first3num(int startRange, int endRange) 
	{
		System.out.println("First 3 numbers divisible by 3 and 4 are : ");
		for(int num = startRange; num <= endRange; num++)
		{
			if(num%3 == 0 && num%4 == 0) 
			{
				System.out.println(num);
				count++;
				if(count == 3)
				break;
			}
		}

   }
	public static void main(String[] args) 
	{
		Divisible3 divisible3 = new Divisible3();
		divisible3.first3num(10,500);
	}
}
