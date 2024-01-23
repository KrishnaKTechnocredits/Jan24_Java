package samiksha;

class Days1{
   
    void printDays(int dayIndex){
        if(dayIndex <= 0){
	      System.out.println("Invalid index");
	    }else if(dayIndex <= 5){
		  System.out.println("weekdays");
		  if(dayIndex == 1){
		    System.out.println("Today is monday");
		  }else if(dayIndex == 2){
		    System.out.println("Today is tuseday");
		  }else if(dayIndex == 3){
		    System.out.println("Today is wednesday");
		  }else if(dayIndex == 4){
		    System.out.println("Today is thursday");
		  }else if(dayIndex == 5){
		  System.out.println("Today is friday");
		  }
		}else if(dayIndex == 6||dayIndex == 7){
		  System.out.println("weekend");
		  if(dayIndex == 6){
		    System.out.println("Today is saturday");
		  }else if(dayIndex == 7){
		    System.out.println("Today is sunday");
		  }
		}
    }
	
	public static void main(String[] args){
		Days1 days = new Days1();
		days.printDays(2);
		days.printDays(6);
		days.printDays(11);
		days.printDays(-3);
		days.printDays(7);
		
	}

}