package pallavi_raut;
class FindMonth{
	
	void monthName(int monthIndex){
			if(monthIndex == 1 || monthIndex == 2 || monthIndex == 3){
				System.out.println("This is month " + monthIndex + " of FY2024- 1st Quarter");
				if (monthIndex == 1){
					System.out.println("January.");
				}
				else if (monthIndex == 2){
					System.out.println("February.");
				}
				else if (monthIndex == 3){
					System.out.println("March.");
				}
			}
			else if(monthIndex == 4 ||monthIndex == 5 || monthIndex ==6){
				System.out.println("This is month " + monthIndex + " of FY2024- 2nd Quarter");
				if (monthIndex == 4){
					System.out.println("April.");
				}
				else if (monthIndex == 5){
					System.out.println("May.");
				}
				else if (monthIndex == 6){
					System.out.println("June.");
				}
			}	
			else if(monthIndex ==7 ||monthIndex == 8 || monthIndex == 9){
				System.out.println("This is month " + monthIndex + " of FY2024- 3rd Quarter");
				if (monthIndex == 7){
					System.out.println("July.");
				}
				else if (monthIndex == 8){
					
					System.out.println("August.");
				}
				else if (monthIndex == 9){
					System.out.println("September.");
				}
			}	
			else if(monthIndex == 10 ||monthIndex == 11 || monthIndex == 12){
				System.out.println("This is month " + monthIndex + " of FY2024- 4th Quarter");
				if (monthIndex == 10){
					System.out.println("October.");
				}
				else if (monthIndex == 11){
					System.out.println("November.");
				}
				else if (monthIndex == 12){
					System.out.println("December.");
				}
			}
			else{
				System.out.println(+ monthIndex + " is not valid Month");
			}	
		}
		
	public static void main(String[] args)
	{
		FindMonth findMonth= new FindMonth();
		findMonth.monthName(1);
		findMonth.monthName(13);
		findMonth.monthName(7);
		findMonth.monthName(-3);
		findMonth.monthName(14);
		findMonth.monthName(10);
		findMonth.monthName(0);
		findMonth.monthName(16);
	}
}	
