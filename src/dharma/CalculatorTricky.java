package dharma;

class Calculatortricky{
	
	int amount;
	
	void add(int num1,int num2){
		amount =amount + (num1+num2);
	}
	
	void sub(int num1,int num2){
		amount =amount + (num1-num2);
	}
	
	void mul(int num1,int num2){
		amount =amount + (num1*num2);
	}
	
	void div(int num1,int num2){
		amount =amount + (num1/num2);
	}
	
	void sumOfAll(){
		System.out.println("Total Of All Functions : " + amount);
	}
	
	public static void main(String[] args){
		Calculatortricky calculatorTricky = new Calculatortricky();
		calculatorTricky.add(10,20);
		calculatorTricky.sub(50,55);
		calculatorTricky.mul(44,4);
		calculatorTricky.div(80,80);
		calculatorTricky.sumOfAll();
	}
}
	