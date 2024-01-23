package nisarg_patel;

public class Assignment8Weekly {
	
	void weekday(int dayIndax) {
		if(dayIndax >=1 && dayIndax<=5) {
			System.out.println("It is a Weekday");
			if(dayIndax == 1)
				System.out.println("Monday");
			else if(dayIndax == 2)
				System.out.println("Tuseday");
			else if(dayIndax == 3)
				System.out.println("Wednesday");
			else if(dayIndax == 4)
				System.out.println("Thursday");
			else
				System.out.println("Friday");
		}
		else if(dayIndax == 6 || dayIndax == 7) {
			System.out.println("It is a Weekend");
			if(dayIndax == 6)
				System.out.println("Saturday");
			else
				System.out.println("Sundy");
		}
		else {
			System.out.println("Invalid Day Number in Weekday");
		}
	}
	
	public static void main(String[] args) {
		Assignment8Weekly assignment8Weekly = new Assignment8Weekly();
		assignment8Weekly.weekday(3);
		assignment8Weekly.weekday(2);
		assignment8Weekly.weekday(7);
		assignment8Weekly.weekday(11);
	}
}
