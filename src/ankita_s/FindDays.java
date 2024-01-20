package ankita_s;

class FindDays{
 
	void dayIndex(int day){
		if (day==1){
			System.out.println("weekday");
			System.out.println("Its a monday");
		}
		else if (day==2){
			System.out.println("weekday");
			System.out.println("Its a tuesday");
		}
		else if (day==3){
			System.out.println("Invalid Index");
		}
		else if (day==6){
			System.out.println("weekend");
			System.out.println("Its a Saturday");
		}
		else if (day==7){
			System.out.println("weekend");
			System.out.println("Its a Sunday");
		}
		else if (day==11){
			System.out.println("Invalid Index");
		}
		else if (day==4){
			System.out.println("weekend");
			System.out.println("Its a Thrusday");
		}
	}
	
	public static void main (String[] args){
		FindDays findday = new FindDays();
		findday.dayIndex(1);
		findday.dayIndex(2);
		findday.dayIndex(7);
		findday.dayIndex(6);
		findday.dayIndex(11);
		findday.dayIndex(3);
	}
}
	