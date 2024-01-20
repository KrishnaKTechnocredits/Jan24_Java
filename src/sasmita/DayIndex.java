package sasmita;

class DayIndex {

	void printDay(int dayIndex) {
	 if(dayIndex >= 1 && dayIndex <=5) {
		System.out.println("its a Weekdays");
        if(dayIndex == 1) {
		  System.out.println("Monday");
	    }else if(dayIndex == 2) {
		  System.out.println("Tuesday");
	    }else if(dayIndex == 3) {
		  System.out.println("wednesday");
	    }else if(dayIndex == 4) {
		  System.out.println("Thursday");
	    }else {
		  System.out.println("Friday");
	    }
	 }else if(dayIndex == 6 || dayIndex ==7){
		System.out.println("its a Weekend");
		if(dayIndex == 6) {
		   System.out.println("Saturday");
		}else {
			System.out.println("sunday");			
		}
	}else {
		System.out.println("Invalid day");
	}	
  }			

  public static void main(String[] args) {
	DayIndex day = new DayIndex();
	day.printDay(5);
	day.printDay(-2);
	day.printDay(7);
	day.printDay(10);
}
}

