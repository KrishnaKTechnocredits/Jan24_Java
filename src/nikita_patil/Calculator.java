package nikita_patil;
class Calculator{
	
	   void add(int num1,int num2) {
	   System.out.println("num1 is " + num1 + " , num2 is " + num2 + " , Addition = " + (num1+num2 )); 
	 }
	   
	   void sub(int num1,int num2) {
	   System.out.println("num1 is " + num1 + " , num2 is " + num2 + " , Subtraction = " + (num1-num2 )); 
	 }
	 
	  void div(int num1,int num2) {
	   System.out.println("num1 is " + num1 + " , num2 is " + num2 + " , Division = " + (num1/num2 )); 
	 }
	   
	   void mul(int num1,int num2) {
	   System.out.println("num1 is " + num1 + " , num2 is " + num2 + " , Multiplication = " + (num1*num2 )); 
	 }
	   
 public static void main(String[] args){
	  Calculator c = new Calculator();
	 c.add(20,30);
	 c.sub(50,22);
	 c.div(200,2);
	 c.mul(50,5);
	  }
   }