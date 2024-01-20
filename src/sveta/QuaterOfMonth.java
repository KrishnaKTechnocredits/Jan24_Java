package sveta;
class QuaterOfMonth{
	
	void printMonthInfo(int index){
		
		if(index >= 1 && index <= 3){
			System.out.println("Quater -1");
			if(index == 1){
				System.out.println("January");
			}else if(index == 2){
				System.out.println("February");
			}else if(index == 3){
				System.out.println("March");
			}
		}
		else if(index >= 4 && index <= 6){
			System.out.println("Quater -2");
			if(index == 4){
				System.out.println("April");
			}else if(index == 5){
				System.out.println("May");
			}else if(index == 6){
				System.out.println("June");
			}
		}
		else if(index >= 7 && index <= 8) {
			System.out.println("Quarter-3");
			if(index == 7) {
				System.out.println("July");
			} else if(index == 8) {
				System.out.println("August");
			} else if(index == 9) {
				System.out.println("September");
			}   	
		} 
		
		else if(index >= 10 && index <= 12) {
			System.out.println("Quarter-4");
			if(index == 10) {
				System.out.println("Octomber");
			} else if(index == 11) {
				System.out.println("Novmber");
			} else if(index == 12) {
				System.out.println("December");
			}	
		} 
		
		else {
			System.out.println("Invalid index");
		}
	}
	
	public static void main(String []args){
		
		QuaterOfMonth quaterOfMonth = new QuaterOfMonth();
		quaterOfMonth.printMonthInfo(2);
		quaterOfMonth.printMonthInfo(6);
		quaterOfMonth.printMonthInfo(12);
		quaterOfMonth.printMonthInfo(9);
	}
}
		
