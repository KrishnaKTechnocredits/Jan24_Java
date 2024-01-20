package shridhar_k;

class Assignment1_cal{
	void add(int num1,int num2){
		int add = num1 + num2;
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", additioin = " + add);
	}
	
	void sub(int num1,int num2){
		int sub = num1 - num2;
		System.out.println("num1 is "+ num1 + ", num2 is " + num2 + ", Substraction = " + sub);
	}
	
	void div(int num1,int num2){
		int div = num1 / num2;
		System.out.println("num1 is "+ num1 + ", num2 is " + num2 + ", Division = " + div);
	}
	
	void mul(int num1,int num2){
		int mul = num1 * num2;
		System.out.println("num1 is "+ num1 + ", num2 is " + num2 + ", Multiplication = " + mul);
	}
	
	public static void main(String[] arg){
		Assignment1_cal assignment_cal = new Assignment1_cal();
		assignment_cal.add(20,30);
		assignment_cal.sub(50,22);
		assignment_cal.div(200,10);
		assignment_cal.mul(50,2);
	}
}