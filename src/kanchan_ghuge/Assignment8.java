package kanchan_ghuge;

class Assignment8{
	
	void findDays(int dayNumber){       
		 if(dayNumber>=1 && dayNumber<=5){
			System.out.println("Its a Weekend");
		}	
		if(dayNumber ==1 ){
			System.out.println("Day is Monday");
		}
		else if(dayNumber ==2){	
		    System.out.println("Day is Tueday");
		}
		else if(dayNumber ==3){
			System.out.println("Day is Wednesday");
		}	
		else if(dayNumber ==4){
            System.out.println("Day is Thursday");
		}	
        else if(dayNumber ==5){
            System.out.println("Day is Friday");
		}
		    System.out.println("Not a Weekend");
	}
		
		void printOtherDays(int dayIndex){
			if(dayIndex>5 && dayIndex<=7){
			System.out.println("Its a Weekend");
			}
			else{
			System.out.println("Invalid Numbers");
			}
		}	

	public static void main(String [] args){
		Assignment8 assignment8 = new Assignment8();
		assignment8.findDays(9);
		assignment8.printOtherDays(0);
		assignment8.printOtherDays(9);
		assignment8.printOtherDays(7);
		
		
	}
}	