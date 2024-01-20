package rohini_deshmane;

public class YearDetails {
	void printMonths(int index) {
		if(index >= 1 && index <= 3) {
			System.out.println("Quarter Q1");
			if(index == 1) {
				System.out.println("January");
			} else if (index == 2) {
				System.out.println("February");
			} else {
				System.out.println("March");
			} 
		} else if(index >= 4 && index <= 6) {
			System.out.println("Quarter Q2");
			if(index == 4) {
				System.out.println("April");
			} else if(index == 5) {
				System.out.println("May");
			} else {
				System.out.println("June");
			}
		} else if(index >= 7 && index <= 9) {
			System.out.println("Quarter Q3");
			if(index == 7) {
				System.out.println("July");
			} else if (index == 8) {
				System.out.println("Auguest");
			} else {
				System.out.println("September");
			}
		} else if(index >= 10 && index <= 12) {
			System.out.println("Quarter Q4");
			if(index == 10) {
				System.out.println("Octomber");
			} else if(index ==11) {
				System.out.println("November");
			} else {
				System.out.println("December");
			}
		} else {
			System.out.println("Invalid index");
		}
	}
	
	public static void main(String[] args) {
		YearDetails yearDetails = new YearDetails();
		yearDetails.printMonths(10);
		yearDetails.printMonths(34);
		yearDetails.printMonths(3);
	}
}
