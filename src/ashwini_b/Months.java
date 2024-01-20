package ashwini_b;

class Months{

  void printMonth(int monthIndex){
	
	if(monthIndex >= 1 && monthIndex <=3){
	  System.out.println("Quarter1");
	}
	  else if(monthIndex >= 4 && monthIndex <=6){
		 System.out.println("Quarter2");
      }
	  else if(monthIndex >= 7 && monthIndex <=9){
		 System.out.println("Quarter3");
      }
	  else if(monthIndex >= 10 && monthIndex <=12){
		 System.out.println("Quarter4");
      }
	  else{
		 System.out.println("Invalid entry"); 
	  } 
	if(monthIndex == 1){
	 System.out.println("January"); 
	}
	else if(monthIndex == 2){
	 System.out.println("February"); 
	}
	else if(monthIndex == 3){
	 System.out.println("March"); 
	}
	else if(monthIndex == 4){
	 System.out.println("April"); 
	}
	else if(monthIndex == 5){
	 System.out.println("May"); 
	}
	else if(monthIndex == 6){
	 System.out.println("June"); 
	}
	else if(monthIndex == 7){
	 System.out.println("July"); 
	}
	else if(monthIndex == 8){
	 System.out.println("August"); 
	}
	else if(monthIndex == 9){
	 System.out.println("September"); 
	}
	else if(monthIndex == 10){
	 System.out.println("October"); 
	}
	else if(monthIndex == 11){
	 System.out.println("November"); 
	}
	else if(monthIndex == 12){
	 System.out.println("December"); 
	}
	else {
	 System.out.println("Invalid entry"); 
	}
  }
  public static void main(String[] args){
	 Months months = new Months();
	 months.printMonth(1);
	 months.printMonth(7);
	 months.printMonth(12);
	 months.printMonth(14);
   }
  } 