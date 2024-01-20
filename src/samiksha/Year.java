package samiksha;

class Year{
	
	void printMonths(int month){
		if(month <= 0){
			System.out.println("invalid index");
		}else if(month<=3){
			System.out.println("Quarter 1");
			if(month == 1){
			   System.out.println("january");
			}else if(month == 2){
			   System.out.println("february");
			}else if(month == 3){
			   System.out.println("march");
			}
		}else if(month<=6){
			System.out.println("Quarter 2");
			if(month == 4){
			   System.out.println("April");
			}else if(month == 5){
			   System.out.println("May");
			}else if(month == 6){
			   System.out.println("june");
			}
		}else if(month<=9){
			System.out.println("Quarter 3");
			if(month == 7){
			   System.out.println("jully");
			}else if(month == 8){
			   System.out.println("August");
			}else if(month == 9){
			   System.out.println("september");
			}
		} else if(month<=12){
			System.out.println("Quarter 4");
			if(month == 10){
			   System.out.println("october");
			}else if(month == 11){
			   System.out.println("November");
			}else if(month == 12){
			   System.out.println("December");
			}
		}              
	}
	
	public static void main(String[]args){
		Year year = new Year();
		year.printMonths(2);
		year.printMonths(5);
		year.printMonths(11);
		year.printMonths(8);
		year.printMonths(-9);
	}
}