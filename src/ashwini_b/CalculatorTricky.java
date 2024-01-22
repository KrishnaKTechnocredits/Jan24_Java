package ashwini_b;

/*Assignment - 2 : 16th Jan'2024
Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will
print addition of answers get from all the methods.
*/

class CalculatorTricky {
    int answer;
	
    void add(int num1, int num2){
	   answer = answer +(num1 + num2);
	   System.out.println("sum is " + answer);
	 }
	 
	 void sub(int num1, int num2){
		answer = answer +(num1 - num2);
		System.out.println("sub is " + answer);
	 }
	 
	 void mul(int num1, int num2){
	 answer = answer +(num1 * num2);
	 System.out.println("mult is " + answer);
	 }
	 
	 void div(int num1, int num2){
	 answer = answer +(num1 / num2);
	 System.out.println("div is " + answer);
	 }
	 
	 void display(){
	 System.out.println("addition of all is " + answer);
	 }
	 
	 public static void main(String[] args){
	  CalculatorTricky calculatorTricky = new CalculatorTricky();
	  calculatorTricky.add(10, 20);//30
	  calculatorTricky.sub(20, 10);//10
	  calculatorTricky.mul(10, 20);//200
	  calculatorTricky.div(10, 5);//2
	  calculatorTricky.display();
	 }
}	 

/*
answer-->
sum is 30
sub is 40
mult is 240
div is 242
addition of all is 242
*/

	   
	   
	  