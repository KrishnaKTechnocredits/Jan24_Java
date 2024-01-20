package suresh;

class Example {

	void day(int index)
	{
		if (index>=1 && index<=5) 
		{
			System.out.println("weekday");
				if(index==1)
			{
				System.out.println("monday");
			}
			else if(index==2)
			{
				System.out.println("Tuesday");
				
			}
			else if(index==3)
			{
				System.out.println("wednesday");
				
			}
			else if (index==4)
			{
				System.out.println("Thurday");
				
			}
			else if (index==5)
			{
				System.out.println("Friday");
			}
		}
	
		if(index==6||index==7)

	{
		System.out.println("weekends");
	}

		 if (index == 6) {
			System.out.println("Saturday");
		} 
		else 
		{
		}
		 System.out.println("Sunday");
		}
	

	public static void main (String[] args)
			{
				Example example = new Example ();
				example.day(4);
				example.day(6);
				
			}
}