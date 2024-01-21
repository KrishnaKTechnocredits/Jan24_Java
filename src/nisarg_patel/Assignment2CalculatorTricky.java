package nisarg_patel;
class Assignment2CalculatorTricky{
	 
	int ans;
	 
	void add(int num1,int num2){
		ans = ans + (num1 + num2);
	}
	
	void sub(int num1,int num2){
		ans = ans + (num1 - num2);
	}
	
	void mul(int num1,int num2){
		ans = ans + (num1 * num2);
	}
	
	void div(int num1,int num2){
		ans = ans + (num1 / num2);
	}
	
	void display(){
		System.out.println("Addition of Answers : " + ans);
	}
	
	public static void main(String[] args){
		Assignment2CalculatorTricky assignment2CalculatorTricky = new Assignment2CalculatorTricky();
		assignment2CalculatorTricky.add(20,30);
		assignment2CalculatorTricky.sub(50,22);
		assignment2CalculatorTricky.mul(50,5);
		assignment2CalculatorTricky.div(200,10);
		assignment2CalculatorTricky.display();
	}
}