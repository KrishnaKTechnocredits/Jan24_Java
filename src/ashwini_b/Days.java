package ashwini_b;

/*
Find weekdays or weekends based on dayIndex. 

1 -> Monday
2 -> Tuesday
7 -> Sunday

input:
dayIndex -> 2 : Weekday
Its a tuesday

dayIndex -> 6 : WeekEnd
Its a saturday

dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index
*/

class Days{
     
	 void printDay(int dayIndex){
        
	  if(dayIndex >= 1 && dayIndex <= 5){
       System.out.println("Its Weekday");
	   } 
	   else if(dayIndex >= 6 || dayIndex <= 7){
	     System.out.println("Its WeekEnd"); 
	   } else {
		 System.out.println("Invalid date"); 
	   }
	   
	  if(dayIndex == 1){
	    System.out.println("Monday");
	  }
	   else if(dayIndex == 2){
	    System.out.println("Tueday");
	  }
	   else if(dayIndex == 3){
	    System.out.println("Wednesday");
	  }
	   else if(dayIndex == 4){
	    System.out.println("Thursday");
	  }
       else if(dayIndex == 5){
	    System.out.println("Friday");
	  }
	   else if(dayIndex == 6){
	    System.out.println("Saturday");
	  } 
	   else if(dayIndex == 7){
	    System.out.println("Sunday");
	  }
    }
     public static void main(String[] args){
     	Days days = new Days();
        days.printDay(1);
		days.printDay(2);
		days.printDay(3);
		days.printDay(6);
		days.printDay(7);
	  }
	}
		  