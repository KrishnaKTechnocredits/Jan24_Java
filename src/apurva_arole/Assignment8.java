package apurva_arole;

public class Assignment8 {
	void printday(int dayIndex) {
		  if(dayIndex>=3 && dayIndex<=5) {
			 System.out.println("Its a Weekday");
		     if(dayIndex==1)
				System.out.println("Monday");
		     else if(dayIndex==2)
			    System.out.println("Tuesday");
		     else if(dayIndex==3)
			    System.out.println("wednesday");
		     else if(dayIndex==7)
				System.out.println("Sunday");
		     else if(dayIndex==6 ||dayIndex>=8)
		        System.out.println("Its a Weekend");
		     if(dayIndex==6){ 
		        System.out.println("Saturday");
		     }
		     else{
		    	System.out.println("sunday");
		     }
		  }
		  else{
		     System.out.println("Invalid statement");
		  }
	 }
	 public static void main(String[] args){
	    		Assignment8 assignment8= new Assignment8();
	    		assignment8.printday(3);
	    		assignment8.printday(6);
	    		assignment8.printday(11);
	    		assignment8.printday(4);
	    		assignment8.printday(-8);
	    	}
		 }
		
