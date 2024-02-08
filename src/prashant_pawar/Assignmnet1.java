package prashant_pawar;
class Assignmnet1{
	
	void add(int num1,int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", addition = " + ( num1 + num2) );
	}
	
	void sub(int num1,int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", substraction = " + ( num1 - num2) );
		
	}
	
	void mul(int num1,int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", mulplication = " + ( num1 * num2) );
	}
	
	void div(int num1,int num2){
		
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", division = " + ( num1 * num2) );
	}
	
	public static void main(String[] args){
		Assignmnet1 assignmnet = new Assignmnet1();
		assignmnet.add(20,30);
		assignmnet.sub(50,22);
		assignmnet.mul(200,10);
		assignmnet.div(50,5);
	}
}	
	
