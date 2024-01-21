package phenol_verma;

public class MonthQuarter {
	void quarterDecider(int month) {
		if(month >=1 && month <=3) {
			System.out.println("It's Quarter 1");
			if(month == 1)
				System.out.println("Januaray");
			else if(month == 2)
				System.out.println("February");
			else if(month == 3)
				System.out.println("February");
		} else if(month >=4 && month <=6) {
			System.out.println("It's Quarter 2");
			if(month == 4)
				System.out.println("April");
			else if(month == 5)
				System.out.println("May");
			else if(month == 6)
				System.out.println("June");
		}  else if(month >=7 && month <=9) {
			System.out.println("It's Quarter 3");
			if(month == 7)
				System.out.println("July");
			else if(month == 8)
				System.out.println("August");
			else if(month == 9)
				System.out.println("September");
		} else if(month >=10 && month <=12) {
			System.out.println("It's Quarter 4");
			if(month == 10)
				System.out.println("October");
			else if(month == 11)
				System.out.println("November");
			else if(month == 12)
				System.out.println("December");
		} else 
			System.out.println("Invalid Month");
	}
	
	public static void main(String[] args) {
		MonthQuarter monthQuarter = new MonthQuarter();
		monthQuarter.quarterDecider(1);
		monthQuarter.quarterDecider(5);
		monthQuarter.quarterDecider(9);
		monthQuarter.quarterDecider(10);
		monthQuarter.quarterDecider(-3);
	}
}

