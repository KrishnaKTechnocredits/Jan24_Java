package varsha;

class MonthInfo{
	
	void printMonthDetail(int monthIndex){
		if(monthIndex >= 1 && monthIndex <= 3) {
			System.out.println("It is Quadrant1");
			if(monthIndex == 1 ) {
				System.out.println("January");
			} else if(monthIndex == 2) {
				System.out.println("February");
			} else {
				System.out.println("March");
			}
		} else if(monthIndex >=4 && monthIndex <= 6) {
			System.out.println("It is Quadrant2");
			if(monthIndex == 4 ) {
				System.out.println("April");
			} else if(monthIndex == 5) {
				System.out.println("May");
			} else {
				System.out.println("June");
			}
		} else if(monthIndex >=7 && monthIndex <= 9) {
			System.out.println("It is Quadrant3");
			if(monthIndex == 7 ) {
				System.out.println("July");
			} else if(monthIndex == 8) {
				System.out.println("August");
			} else {
				System.out.println("September");
			}
		} else if (monthIndex >= 10 && monthIndex <= 12){
			System.out.println("It is Quadrant4");
			if(monthIndex == 10 ) {
				System.out.println("October");
			} else if(monthIndex == 11) {
				System.out.println("November");
			} else {
				System.out.println("December");
			}
		} else {
			System.out.println("Invalid monthindex");
		}
	}

	public static void main(String[] args){
		MonthInfo monthInfo = new MonthInfo();
		monthInfo.printMonthDetail(12);
		monthInfo.printMonthDetail(7);
		monthInfo.printMonthDetail(4);
		monthInfo.printMonthDetail(15);
		monthInfo.printMonthDetail(3);
		monthInfo.printMonthDetail(6);
		monthInfo.printMonthDetail(10);		
	}
}