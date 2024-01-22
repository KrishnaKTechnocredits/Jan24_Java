package nisarg_patel;

class Assignment7MinimumMaximumNumber{
	
	void MaximumNumber(int num1, int num2){
		if (num1 > num2){
			System.out.println(num1 + " is Big Number Between "  + num1 + "&" + num2);
		}
		
		else {
			System.out.println(num2 + " is Big Number Between "  + num1 + "&" + num2);
		}
	}
	
	void MinimumNumber(int num1, int num2){
		if (num1 < num2){
			System.out.println(num1 + " is Small Number Between "  + num1 + "&" + num2);
		}
		
		else{
			System.out.println(num2 + " is Small Number Between "  + num1 + "&" + num2);
		}
	}
	
	public static void main(String[] args){

		Assignment7MinimumMaximumNumber assignment7MinimumMaximumNumber = new Assignment7MinimumMaximumNumber();
		assignment7MinimumMaximumNumber.MaximumNumber(17,10);
		assignment7MinimumMaximumNumber.MinimumNumber(17,10);
	}
}