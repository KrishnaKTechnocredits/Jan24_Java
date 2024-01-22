package sasmita;

class Calculator3{

   void add(int num1,int num2){
	   System.out.println("sum is "      +(num1+num2));
   }
   
   public static void main(String[]args){
	   Calculator3 calculator = new Calculator3();
	   calculator.add(20,30);
   }
}