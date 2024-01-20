package akshay_gaikwad;

class DayIndex{

	void dayIndex(int index){
		
		if (index <= 0 || index > 7){
			System.out.println("Day Index -> " + index + " : Invalid index");
		}
		
		else if (index <= 5) {
			System.out.println("Weekday");
			if (index == 1){
				System.out.println("Its a Monday");
			} else if (index == 2) {
				System.out.println("Its Tuesday");
			} else if (index == 3) {
				System.out.println("Its Wendsday");
			} else if (index == 4) {
				System.out.println("Its Thursday");
			} else{
				System.out.println("Its Friday");
			}
		}
		else {
			System.out.println("Weekend");
			if (index == 6){
				System.out.println("Its a Saturday");
			} else {
				System.out.println("Its a Sunday");
			}
		}
	}
	
	public static void main(String[] args){
		DayIndex dayindex = new DayIndex();
		dayindex.dayIndex(-1);
		dayindex.dayIndex(0);
		dayindex.dayIndex(1);
		dayindex.dayIndex(2);
		dayindex.dayIndex(4);
		dayindex.dayIndex(5);
		dayindex.dayIndex(6);
		dayindex.dayIndex(7);
		dayindex.dayIndex(8);
	}
}