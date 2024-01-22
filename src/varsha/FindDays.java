package varsha;

class FindDays{
	
	void printDaysInfo(int dayIndex){

		if(dayIndex >= 1 && dayIndex <= 5){
			System.out.println("It is weekday");
			if(dayIndex == 1) {
				System.out.println("Monday");
			} else if (dayIndex == 2) {
				System.out.println("Tuesday");
			} else if (dayIndex == 3) {
				System.out.println("wednesday");
			} else if (dayIndex == 4) {
				System.out.println("Thursday");
			} else {
				System.out.println("Friday");
			}
		} else if(dayIndex == 6 || dayIndex == 7) {
			System.out.println("It is weekend");
			if(dayIndex == 6){
				System.out.println("Saturday");
			} else {
				System.out.println("Sunday");
			}
		} else {
			System.out.println("Invaliday dayIndex");
		}
	}

	public static void main(String[] args){
		FindDays findDays = new FindDays();
		findDays.printDaysInfo(4);
		findDays.printDaysInfo(7);
		findDays.printDaysInfo(1);
		findDays.printDaysInfo(-3);
		findDays.printDaysInfo(3);
		findDays.printDaysInfo(6);
		findDays.printDaysInfo(11);

	}
}