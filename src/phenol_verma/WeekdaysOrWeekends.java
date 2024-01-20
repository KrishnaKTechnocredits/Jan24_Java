/* Assignment - 8 : 19th Jan'2024

Find weekdays or weekends based on dayIndex. 

1 -> Monday
2 -> Tuesday
7 -> Sunday

input:
dayIndex -> 2 : Weekday
Its a tuesday

dayIndex -> 6 : WeekEnd
Its a saturday

dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index*/

package phenol_verma;

public class WeekdaysOrWeekends {
	void dayDecider(int day) {
		if(day >=1 && day <=5) {
			System.out.println("It's Weekday");
			if(day == 1)
				System.out.println("Monday");
			else if(day == 2)
				System.out.println("Tuesday");
			else if(day == 3)
				System.out.println("Wednesday");
			else if(day == 4)
				System.out.println("Thursday");
			else if(day == 5)
				System.out.println("Friday");
		} else if(day == 6 || day == 7) {
			System.out.println("It's Weekend");
			if(day == 1)
				System.out.println("Saturday");
			else
				System.out.println("Sunday");
		} else
			System.out.println("Invalid input");
	}

	public static void main(String[] args) {
		WeekdaysOrWeekends weekdaysOrWeekends = new WeekdaysOrWeekends();
		weekdaysOrWeekends.dayDecider(2);
		weekdaysOrWeekends.dayDecider(5);
		weekdaysOrWeekends.dayDecider(6);
		weekdaysOrWeekends.dayDecider(-3);
	}
}
		

