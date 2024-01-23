package hiral_purohit;

class Calculator{
				
		void add(int num1,int num2){
			int ans = num1 + num2;
			System.out.println("num1 is " + (num1) + ", num2 is " + (num2) + ", addition = " + (ans));
		}	
		
		void sub(int num1,int num2){
			int ans = num1 - num2;
			System.out.println("num1 is " + (num1) + ", num2 is "  + (num2) + ", subtraction = "+ (ans));	
		}
		
		void div(int num1,int num2){
			int ans = num1 / num2;
			System.out.println("num1 is " + (num1) + ", num2 is " + (num2) + ", division = " + (ans));
		}
		
		void mul(int num1,int num2){
			int ans = num1 * num2;
			System.out.println("num1 is " + (num1) + ", num2 is " + (num2) + ", multiplication = " + (ans));
		}
		
		public static void main(String[]args){
			Calculator calculator = new Calculator();
			calculator.add(20,30);
			calculator.sub(50,22);
			calculator.div(200,10);
			calculator.mul(50,5);
			
		}
}