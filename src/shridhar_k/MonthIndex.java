package shridhar_k;

class MonthIndex{
	void monthIndexInfo(int monthIndex){
		if (monthIndex >=1 && monthIndex <=3){
			System.out.println("its 1st quarter of the year");
			if(monthIndex == 1){
				System.out.println("Its Janavery");
			}else if(monthIndex == 2){
				System.out.println("Its Feb");
			}else{
				System.out.println("Its March");
			}
		}else if (monthIndex >= 4 && monthIndex <= 6){
			System.out.println("its 2nd quarter of the year");
			if(monthIndex == 4){
				System.out.println("Its April");
			}else if(monthIndex == 5){
				System.out.println("Its May");
			}else{
				System.out.println("Its June");
			}
		}else if (monthIndex >= 7 && monthIndex <= 9){
			System.out.println("its 3rd quarter of the year");
			if(monthIndex == 7){
				System.out.println("Its July");
			}else if(monthIndex == 8){
				System.out.println("Its Augest");
			}else{
				System.out.println("Its Suptember");
			}
		}else if (monthIndex >= 10 && monthIndex <= 12){
			System.out.println("its 4th quarter of the year");
			if(monthIndex == 10){
				System.out.println("Its October");
			}else if(monthIndex == 11){
				System.out.println("Its November");
			}else{
				System.out.println("Its December");
			}
		}else {
			System.out.println("Invalida month index");
		}
	}
	
	public static void main(String[] arg){
		MonthIndex monthIndex = new MonthIndex();
		monthIndex.monthIndexInfo(0);
		monthIndex.monthIndexInfo(3);
		monthIndex.monthIndexInfo(8);
		monthIndex.monthIndexInfo(13);
	}
}