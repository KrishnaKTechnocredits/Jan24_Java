package sveta;
class Days{

	void printDays(int dayNumber) {
		if(dayNumber >= 1 && dayNumber <= 5) {
			System.out.println("It's a weekday");
			if(dayNumber == 1) {
				System.out.println("Monday");
			} else if(dayNumber == 2){
				System.out.println("Tuesday");
			} else if(dayNumber == 3){
				System.out.println("Wednesday");
			} else if(dayNumber == 4) {
				System.out.println("Thursday");
			} else {
				System.out.println("Friday");
			}
		} else if(dayNumber == 6 || dayNumber == 7) {
			System.out.println("It's a weekend");
			if(dayNumber == 6) {
				System.out.println("Saturday");
			} else {
				System.out.println("Sunday");
			}
		} else {
			System.out.println("Invalid Day number");
		}
	}
	public static void main(String args[]){
		Days day=new Days();
		day.printDays(2);
		day.printDays(3);
		day.printDays(6);
		day.printDays(8);
	}
}