package shraddha;

class DayIndex{
	
	void week(int dayIndex){
		if(dayIndex < 0 || dayIndex > 7){
			System.out.println(dayIndex + "---> Invalid Index");
		}
		else if(dayIndex < 6){
			System.out.println("Its a weekday");
			if(dayIndex == 1){
				System.out.println(dayIndex + "--> Today is Monday");
			}
			else if(dayIndex == 2){
				System.out.println(dayIndex + "-->Today is Tuesday");
			}
			else if(dayIndex == 3){
				System.out.println(dayIndex + "-->Today is Wednesday");
			}
			else if(dayIndex == 4){
				System.out.println(dayIndex + "-->Today is Thrusday");
			}
			else if (dayIndex == 5){
				System.out.println(dayIndex + "-->Today is Friday");
			}
		}
		else { 
			System.out.println("Its a weekend");
			if(dayIndex == 6){
				System.out.println(dayIndex + "-->Today is Saturday");
			}
			else {
				System.out.println(dayIndex + "-->Today is Sunday");
			}
		}
		
	}
	
	public static void main(String[] args){
		DayIndex dayIndex = new DayIndex();
		dayIndex.week(2);
		dayIndex.week(6);
		dayIndex.week(11);
		dayIndex.week(-3);
		dayIndex.week(7);
	}
}