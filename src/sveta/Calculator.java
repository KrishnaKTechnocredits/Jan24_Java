package sveta;
class Calculator{
	
	void add(int num1,int num2){
		
		System.out.println("Sum Of " +num1 +" and "+num2+" is "+(num1+num2));
	}
	
	void sub(int num1,int num2){
		
		System.out.println("Substraction " +num1 +" and "+num2+" is "+(num1-num2));
	}
	
	void mul(int num1,int num2){
		System.out.println("Multiplication Of " +num1 +" and "+num2+" is "+(num1*num2));
	}
	
	void div(int num1,int num2){
		System.out.println("division Of " +num1 +" and "+num2+" is "+(num1/num2));
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(10,20);
		calculator.sub(20,10);
		calculator.mul(30,2);
		calculator.div(14,7);
	}
}
