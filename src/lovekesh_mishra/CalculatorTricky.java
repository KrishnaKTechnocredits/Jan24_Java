package lovekesh_mishra;

class CalculatorTricky {
	
	      int totalSum;
		  
		      void add (int num1 , int num2){
			       totalSum = totalSum +(num1+num2);
			  }

              void sub (int num1 , int num2){
				   totalSum = totalSum +(num1-num2);
				  
			  }
			  
			  void mul (int num1 , int num2){
				  totalSum = totalSum +(num1*num2);
				  
			  }
			  
			  void div (int num1 , int num2){
				  totalSum = totalSum +(num1/num2);
				  
			  }
			  
			  void display(){
				  System.out.println(totalSum);
				  
			  }
			  
			  public static void main(String[] args){
				  CalculatorTricky calculatorTricky = new CalculatorTricky();
				  calculatorTricky.add(10,20);
				  calculatorTricky.sub(10,5);
				  calculatorTricky.mul(10,20);
				  calculatorTricky.div(10,5);
				  calculatorTricky.display();
				  
			  }	
}