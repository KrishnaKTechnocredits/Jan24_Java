package shafaque;

public class Assignment13 {
	void D1(int startindex , int endindex)
	{
		for(int num = startindex  ;  num >= endindex; num--)
			if (num % 5 == 0 && num% 9 == 0)
			{
			  System.out.println("Last number divisible by 5 & 9 is " + num);
			  break;
			}
		
	}
		public static void main(String[] args)
		{
			Assignment13 assignment13 = new Assignment13();
			assignment13.D1(90, 5);
		}
}

