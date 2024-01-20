package shraddha;

class CalculatorTricky{
	
	int ans;
	
	void add(int a, int b){
		
		int temp= a + b;
		ans = temp;
	}
	
	void sub(int a , int b){
	
		int temp= a - b;
		ans = ans + temp;
	}
	
	void mul(int a, int b){
		
		int temp = a * b;
		ans = ans + temp;
	}
	
	void div(int a, int b){
	
		int temp = a / b;
		ans = ans + temp;
	}
	
	void print(){
	
		System.out.println("Total: "+ ans);
	}
	
	public static void main(String[] args){
	
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(10,20);
		calculatorTricky.sub(10,5);
		calculatorTricky.mul(3,2);
		calculatorTricky.div(20,2);
		calculatorTricky.print();
	}
}