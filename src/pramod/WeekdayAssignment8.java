package pramod;

class WeekdayAssignment8
{
	void day(int dayindex)
	{
		if(dayindex >=1 && dayindex <= 5)
		{
			System.out.println("Weekday");
			if(dayindex == 1)
			System.out.println("its a Monday");
			else if (dayindex == 2)
			System.out.println("its a Tuesday");
			else if (dayindex == 3)
			System.out.println("its a Wednesday");
			else if (dayindex == 4)
			System.out.println("its a Thursday");
			else
			System.out.println("its a Friday");
		} else if(dayindex >=6 && dayindex <= 7)
		{
			System.out.println("Weekend");
			if(dayindex == 6)
			System.out.println("its a Saturday");
			else if (dayindex == 7)
			System.out.println("its a Sunday");
		}else
		{
			System.out.println("invalid Index");
		}
	}
	public static void main(String...s)
	{
		WeekdayAssignment8 weekdayassignment8 = new WeekdayAssignment8();
		weekdayassignment8.day(2);
		weekdayassignment8.day(6);
		weekdayassignment8.day(11);
		weekdayassignment8.day(-3);
	}
}