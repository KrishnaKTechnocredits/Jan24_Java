package akshay_gaikwad;

class MonthIndex{

	void monthIndex(int index){
		if (index <= 0 || index > 12){
			System.out.println("Invalid index");
		} else {
			if ( index > 0 && index  <= 3){
				System.out.println("Quarter 1");
				if (index == 1){
					System.out.println("Its January");
				} else if (index == 2){
					System.out.println("Its Frbruary");
				} else {
					System.out.println("Its March");
				}
			} else if ( index > 3 && index  <= 6){
				System.out.println("Quarter 2");
				if (index == 4){
					System.out.println("Its April");
				} else if (index == 5){
					System.out.println("Its May");
				} else {
					System.out.println("Its June");
				}
			} else if ( index > 6 && index  <= 9){
				System.out.println("Quarter 3");
				if (index == 7){
					System.out.println("Its July");
				} else if (index == 8){
					System.out.println("Its August");
				} else {
					System.out.println("Its September");
				}
			}
			else {
				System.out.println("Quarter 4");
				if (index == 10){
					System.out.println("Its October");
				} else if (index == 11){
					System.out.println("Its November");
				} else {
					System.out.println("Its December");
				}
			}
		}
	}
	
	public static void main(String[] args){
		MonthIndex monthindex = new MonthIndex();
		monthindex.monthIndex(-5);
		monthindex.monthIndex(0);
		monthindex.monthIndex(1);
		monthindex.monthIndex(3);
		monthindex.monthIndex(4);
		monthindex.monthIndex(6);
		monthindex.monthIndex(7);
		monthindex.monthIndex(8);
		monthindex.monthIndex(10);
		monthindex.monthIndex(12);
		monthindex.monthIndex(13);
	}
}