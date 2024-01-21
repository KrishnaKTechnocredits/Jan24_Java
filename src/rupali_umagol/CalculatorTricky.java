package rupali_umagol;

class CalculatorTricky{
	int ans;
	
	void add(int num1,int num2){
		 ans = ans + (num1 + num2);
	}
	void sub(int num1, int num2){
		 ans = ans + (num1 - num2);	
	}
	void multi(int num1, int num2){
		 ans = ans + (num1 * num2);	
	}
	void div(int num1, int num2){
		 ans = ans + (num1 / num2);	
	}
	void display(){
		System.out.println("Addition of answers : "+ ans);
	}
	
	public static void main(String[] args){
		CalculatorTricky calculator=new CalculatorTricky();
		calculator.add(20,30);
		calculator.sub(50,22);
		calculator.div(200,10);
		calculator.multi(50,5);
		calculator.display();
	}
}