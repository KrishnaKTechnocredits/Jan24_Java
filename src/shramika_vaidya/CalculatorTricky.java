package shramika_vaidya;
class CalculatorTricky{
	
	int answer;

	void add(int num1 , int num2){
		answer = answer+( num1 + num2) ;	
		
	}
	
	void sub (int num1 , int num2){
		answer = answer +( num1 - num2) ;	
    }
	
	void div(int num1 , int num2){
		answer  =  answer + (num1 / num2) ;	
	}
	
	void mul ( int num1, int num2){
		answer =  answer + (num1 * num2 );
	}
	
	void display(){
		System.out.print(answer);
	}
	
	public static void main(String [] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky ();
		calculatorTricky.add(10,20);
		calculatorTricky.sub(12,9);
		calculatorTricky.div(30,15);
		calculatorTricky.mul(30,40);
		calculatorTricky.display();
	}
}
	
		
