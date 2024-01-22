package ashwini_b;

class CalculatorOperation{
     
	 void add(int num1, int num2){
	     int ans = num1 + num2 ;
		 System.out.println(ans);
	}
	 public static void main(String[] args){
	  CalculatorOperation calculatorOperation = new CalculatorOperation();
	     calculatorOperation.add(10, 20);
	}
	
}	