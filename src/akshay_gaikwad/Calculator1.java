package akshay_gaikwad;

class Calculator1{

	void add(int num1, int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", addition = " + (num1+num2)); 
	}
	
	void sub(int num1, int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", substraction = " + (num1-num2)); 
	}
	
	void div(int num1, int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Division = " + (num1/num2)); 
	}
	
	void mul(int num1, int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Multiplication = " + (num1*num2)); 
	}
	
	public static void main(String[] args){
		
		Calculator1 calculator1 = new Calculator1();
		calculator1.add(20,30);
		calculator1.sub(50,22);
		calculator1.add(200,10);
		calculator1.add(50,5);
	}
}