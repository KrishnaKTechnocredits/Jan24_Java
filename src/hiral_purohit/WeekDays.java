package hiral_purohit;

 public class WeekDays{
	
	void primeDay(int dayIndex) {
		 if (dayIndex >=1 && dayIndex <=5) {
			 System.out.println("It is a weekday");
		     if (dayIndex == 1) 
				 System.out.println("Monday");
			 else if (dayIndex == 2) 
				 System.out.println("Tueseday");
			 else if (dayIndex == 3) 
				 System.out.println("Wednesday");
			 else if (dayIndex == 4)
				 System.out.println("Thursday");
			 else if (dayIndex == 5)
				 System.out.println("Friday");
		     
		 }else if(dayIndex == 6 || dayIndex == 7) {
			 System.out.println("It is a weekend");
			 if (dayIndex == 6)
				 System.out.println("saturday");
			 else if(dayIndex == 7)
			 	System.out.println("sunday");
			 
		 }else if (dayIndex <=0 || dayIndex >7) {
			System.out.println("invalid entry");
	   }
	}
	
	public static void main(String[] args) {
		WeekDays weekDays = new WeekDays();
		weekDays.primeDay(2);
		weekDays.primeDay(6);
		weekDays.primeDay(10);
		weekDays.primeDay(-1);
		weekDays.primeDay(4);
	}
	
}
