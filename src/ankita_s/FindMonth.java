package ankita_s;

class FindMonth{
	
	void monthIndex(int month){
		if (month>=1 && month<=3){
			System.out.println("Quarter1");
		}
		else if (month>=4 && month<=6){
			System.out.println("Quarter2");
		}
		else if (month>=7 && month<=9){
			System.out.println("Quarter3");
		}
		else if (month>=10 && month<=12){
			System.out.println("Quarter4");
		}
		else {
			System.out.println("Invalid entry");
		}
		if (month==1){
			System.out.println("Jan");
		}
		else if (month==2){
			System.out.println("Feb");
		}
		else if (month==3){
			System.out.println("March");
		}
		else if (month==4){
			System.out.println("April");
		}
		else if (month==5){
			System.out.println("May");
		}
		else if (month==6){
			System.out.println("June");
		}
		else if (month==7){
			System.out.println("July");
		}
		else if (month==8){
			System.out.println("Aug");
		}
		else if (month==9){
			System.out.println("Sep");
		}
		else if (month==10){
			System.out.println("Oct");
		}
		else if (month==11){
			System.out.println("Nov");
		}
		else if (month==12){
			System.out.println("Dec");
		}
	}
	
	public static void main (String[] args){
		FindMonth findMonth = new FindMonth();
		findMonth.monthIndex(1);
		findMonth.monthIndex(12);
		findMonth.monthIndex(4);
		findMonth.monthIndex(13);
	}
}
	