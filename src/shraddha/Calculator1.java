package shraddha;

class Calculator1 {

	void add(int num1,int num2){
	System.out.println("The sum of " + num1 + " and " + num2 + " is equals to " + (num1+num2));
	}
	
	void sub(int num1,int num2){
	System.out.println("The subtraction of " + num1 + " minus " + num2 + " is equals to " + (num1-num2));
	}
	
	void mul(int num1,int num2){
	System.out.println("The multiplication of " + num1 + " and " + num2 + " is equals to "  + (num1*num2));
	}
	
	void div(int num1,int num2){
	System.out.println("The division of "+ num1 + " divided by " + num2 + " is equals to " + (num1/num2));
	}
	
	public static void main(String[] args){
	
		Calculator1 calculator1= new Calculator1();
		calculator1.add(10,5);
		calculator1.sub(20,15);
		calculator1.mul(4,4);
		calculator1.div(10,2);
	}
	
}


//"num1 is " + num1+", num2 is "num2+", sum ="(num1+num2)
