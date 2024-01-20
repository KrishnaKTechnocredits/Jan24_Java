package rohit_sutar;

// based on dayIndex and print day
class DayIndex {

	void printDay1(int day) {
		if(day == 1) {
			System.out.println("Monday");
		}else if(day == 2) {
			System.out.println("Tuesday");
		}else if(day == 3) {
			System.out.println("Wednesday");
		}else if(day == 4) {
			System.out.println("Thursday");
		}else if(day == 5) {
			System.out.println("Friday");
		}else if(day == 6) {
			System.out.println("Saturday");
		}else if(day == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Incorrect day selection");
		}
	}
	
	void printDay2(int day){
		if(day >= 1 && day <= 5){
			System.out.println("Its a Weekday");
			if(day == 1){
				System.out.println("Monday");
			}else if(day == 2){
				System.out.println("Tuesday");
			}else if(day == 3){
				System.out.println("Wednesday");
			}else if(day == 4){
				System.out.println("Thursday");
			}else{
				System.out.println("Friday");
			}
		}else if(day == 7 || day == 6){
			System.out.println("Its a Weekend");
			if(day == 6){
				System.out.println("Saturday");
			}else
				System.out.println("Sunday");
		}else
			System.out.println("Wrong Data Selection");
	}
	
	public static void main(String args[]) {
		DayIndex dayIndex1 = new DayIndex();
		DayIndex dayIndex2 = new DayIndex();
		System.out.println("Here is the answer of Method 1 (Assignment 8A)");
		dayIndex1.printDay1(1);
		dayIndex1.printDay1(2);
		dayIndex1.printDay1(7);
		System.out.println();
		System.out.println("Here is the answer of Method 2 (Assignment 8B)");
		dayIndex2.printDay2(2);
		dayIndex2.printDay2(6);
		dayIndex2.printDay2(11);
	}
}
