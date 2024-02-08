package kanchan_ghuge;

class Assignment7{
	
	void maxNumber(int num1, int num2){
		if(num1 < num2){
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		}
		else{
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
		}
	}
	
	void minNumber(int num1, int num2){
		if(num1 > num2){
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
		}
		else{
			System.out.println(num2 + " is greater between " + num1 + " and " + num2);
		}
	}
	
	public static void main(String [] args){
	    Assignment7 assignment7 = new Assignment7();
        assignment7.maxNumber(10,17);
        assignment7.minNumber(10,17);
	}
}	
		