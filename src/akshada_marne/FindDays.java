package akshada_marne;

class FindDays{
	void dayIndex(int num){
		if (num>=1 && num<=5){
			System.out.println(num+": Weekday");
			if(num==1){
				System.out.println("Its Monday");
			}
			else if (num==2){
				System.out.println("Its Tuesday");
			}
			else if (num==3){
				System.out.println("Its Wednesday");
			}
			else if (num==4){
				System.out.println("Its Thursday");
			}
			else{
				System.out.println("Its Friday");
			}
		}
		else if (num==6 || num==7){
			System.out.println(num+": Weekend");
			if(num==6){
				System.out.println("Its Saturday");
			}
			else{
				System.out.println("Its Sunday");
			}
		}
		else{
			System.out.println("Invalid input");
		}
	}
	
	public static void main (String args[]){
		FindDays findDays = new FindDays();
		findDays.dayIndex(2);
		findDays.dayIndex(6);
		findDays.dayIndex(11);
		findDays.dayIndex(-3);
	}
}