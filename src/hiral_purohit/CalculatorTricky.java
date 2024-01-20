package hiral_purohit;

class CalculatorTricky{
		int answer;
		
		void add(int num1, int num2){
			int temp = num1 + num2;
			answer = answer + temp;
			System.out.println("addition is = " + answer);
		}
		
		void sub(int num1, int num2){
			int temp = num1 - num2;
			answer = answer + temp;
			System.out.println("subtraction is = " + answer);
		}
		
		void div(int num1, int num2){
			int temp = num1 / num2;
			answer = answer + temp;
			System.out.println("division is = " + answer);
		}
		
		void mul(int num1, int num2){
			int temp = num1 * num2;
			answer = answer + temp;
			System.out.println("multiplication is = " + answer);
		}
		
		void display(){
			System.out.println("Total Of All = " + answer);
		}	
		
		public static void main(String[]args){
			CalculatorTricky calculatorTricky = new CalculatorTricky();
            calculatorTricky.add(20,10);
			calculatorTricky.sub(10,2);
			calculatorTricky.div(100,10);
			calculatorTricky.mul(30,5);
			calculatorTricky.display();
			
		}
}