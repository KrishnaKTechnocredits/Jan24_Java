package puja_poreddiwar;

class Calculator1{
		
	void add(int num1, int num2)
	{
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", addition = " + (num1 + num2));
	}
	
	void sub(int num1, int num2)
	{
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Subtraction = " + (num1-num2));
	}
	void mul(int num1, int num2)
	{
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", multiplication = " +(num1*num2));
	}
	
	void div(int num1, int num2)
	{
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", Division = " +(num1/num2));
	}
	public static void main(String[] args){
		Calculator1 calulator1=new Calculator1();
		calulator1.add(20, 30);
		calulator1.sub(50,22);
		calulator1.div(200,10);
		calulator1.mul(50,5);
		
	}
	
}