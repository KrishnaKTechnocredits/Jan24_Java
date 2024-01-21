package nisarg_patel;

class Assignment1Calculator{
	
	void add(int num1,int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Addition = " +(num1+num2));
	}
	
	void sub(int num1,int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Subtraction = " +(num1-num2));
	}
	
	void mul(int num1,int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Multiplication = " +(num1+num2));
	}
	
	void div(int num1,int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Division = " +(num1+num2));
	}
	
	public static void main(String[] args){
		Assignment1Calculator assignment1calculator = new Assignment1Calculator();
		assignment1calculator.add(20,30);
		assignment1calculator.sub(50,22);
		assignment1calculator.mul(50,5);
		assignment1calculator.div(200,10);
	}
}