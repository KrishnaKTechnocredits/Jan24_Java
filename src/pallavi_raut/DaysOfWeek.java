package pallavi_raut;

/*Assignment - 8 : 19th Jan'2024

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
dayIndex -> -3 : Invalid Index

============================================================*/

class DaysOfWeek{
	void weekName(int dayIndex){
		if (dayIndex >= 1 && dayIndex <= 5){
			System.out.println("This is Weekday.");
			if(dayIndex ==1){
				System.out.println("Its a Monday");
			}
			else if (dayIndex == 2){
				System.out.println("Its a Tuesday");
			}
			else if(dayIndex == 3){
				System.out.println("Its a Wednesday");
			}
			else if (dayIndex == 4){
				System.out.println("Its a Thursday");
			}
			else if(dayIndex == 5){
				System.out.println("Its a Friday");
			}

		}
		else if(dayIndex == 6 || dayIndex ==7 ){
			System.out.println("This is Weekend.");
			if (dayIndex == 6){
				System.out.println("Its a Saturday");
			}
			else if (dayIndex == 7){
				System.out.println("Its a Sunday");
			}
		}
		else{
				System.out.println(+ dayIndex + " => is Invalid Index.");
		}		
	}
	
	public static void main (String[] args){
		DaysOfWeek dayweek=new DaysOfWeek();
		dayweek.weekName(2);
		dayweek.weekName(6);
		dayweek.weekName(11);
		dayweek.weekName(3);
	}
}