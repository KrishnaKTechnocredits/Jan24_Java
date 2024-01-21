package nikita_patil;
class CalculatorTricky{
     
	   int answer;
	   
	   void add(int num1, int num2){
		   int temp = num1 + num2;
		   answer = answer + temp;
		   System.out.println("Addition - >  " + answer);
	   }
	   
	      void sub(int num1, int num2){
		   int temp = num1 - num2;
		   answer = answer + temp;
		   System.out.println("Subtraction - >  " + answer);
	   }
	   
	   void mul(int num1,int num2){
		     int  temp = num1*num2;
		     answer = answer + temp;
			 System.out.println("Multiplication - >  " + answer);
		   }
	   
	    void div(int num1,int num2){
		     int temp = num1/num2;
		     answer = answer + temp;
		     System.out.println("Division - >  " + answer);
	    }
	   
	   void display(){
		   System.out.println("Answer is   :" + answer);
	   }
	   
	public static void main(String[] args){
		CalculatorTricky c = new CalculatorTricky();
		c.add(10,20);
		 c.sub(10,2);
		 c.mul(2,2);
		c.div(10,5);
		c.display();
	}
}
		   
	   