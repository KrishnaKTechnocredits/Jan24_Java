package madhura_kulkarni;

public class ToFindDay {

	public static void main(String[] args) {
		ToFindDay tofindday= new ToFindDay();
		tofindday.weekday(6);
		tofindday.weekday(4);
		tofindday.weekday(-3);
		tofindday.weekday(0);
	}

	void weekday(int dayindex)
	{
		if(dayindex<=0 || dayindex>7)
		{
			System.out.println("Invalid index");
		} 
		else if(dayindex>=1 && dayindex<=5)
		{
			System.out.println("It's a weekday");
			if (dayindex==1)
				System.out.println("It's a Monday");
			else if (dayindex==2)
				System.out.println("It's a Tuesday");
			else if (dayindex==3)
				System.out.println("It's a Wednesday");
			else if (dayindex==4)
				System.out.println("It's a Thursday");
			else if (dayindex==1)
				System.out.println("It's a Friday");
			
		else if(dayindex==6 || dayindex==7)
		{
			if (dayindex==6)
			{
				System.out.println("It's a Saturday");
			}
			else
			{
				System.out.println("It's a Sunday");
			}
		}
		}
	}
}

		
