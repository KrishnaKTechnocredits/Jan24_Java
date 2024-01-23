package shramika_vaidya;

class FindDays {

	void dayIndex(int day) {
		if(day==1) {
			System.out.println("Weekday");
			System.out.println("Its a Monday");
		}
		else if(day==2) {
			System.out.println("Weekday");
			System.out.println("its a tuesday");
		}
		else if(day==3) {
			System.out.println("Invalid Index");
		}
		else if(day==4) {
			System.out.println("weekday");
			System.out.println("Its a Thursday");
		}
		else if(day==6) {
			System.out.println("Weekend");
			System.out.println("Its a Saturday");
		}
		else if(day==7) {
			System.out.println("weekend");
			System.out.println("Its a Sunday");
		}
		else if(day==11) {
			System.out.println("Invalid index");
		}
		else if (day == 4) {
			System.out.println("weekday");
			System.out.println("Its a Thursday");
		}
	}
	public static void main(String[] args) {
		FindDays findDays = new FindDays();
		findDays.dayIndex(1);
		findDays.dayIndex(2);
		findDays.dayIndex(7);
		findDays.dayIndex(6);
		findDays.dayIndex(11);
		findDays.dayIndex(3);
		}
}

