package sasmita;

class Calculator1{
	
	void add(int num1,int num2){
		System.out.println("num1 is "+num1+",num2 is "+num2+",addition = "+(num1+num2));
	}
	
	void sub(int num1,int num2){
		System.out.println("num1 is "+num1+",num2 is "+num2+",substraction = "+(num1-num2));
	}
	
	void multi(int num1,int num2){
		int ans = num1 * num2;
		System.out.println("num1 is "+num1+",num2 is "+num2+",multiplication = "+(num1*num2));
	}
	
	void div(int num1,int num2){
		int ans = num1 / num2;
		System.out.println("num1 is "+num1+",num2 is "+num2+",Division = "+(num1/num2));
	}
	
	public static void main(String[] args){
		Calculator1 calculator = new Calculator1();
		calculator.add(20,30);
		calculator.sub(50,22);
		calculator.div(200,20);
		calculator.multi(50,5);
	}
}	