package shafaque;

class CalculatorTricky{

   int answer;
   
   void addition(int num1,int num2)
   {
    int temp = num1 + num2;
    answer = answer + temp;
   }
   
   void subtraction(int num1,int num2)
   {
    int temp = num1 - num2;
	answer = answer + temp;
   }
   
   void Multiplication(int num1 , int num2)
   {
    int temp = num1 * num2;
	answer = answer + temp;
   }
   
   void Divison(int num1 , int num2)
   {
    int temp = num1 / num2;
	answer = answer + temp;
   }
   
   void display()
   { 
     System.out.println(answer);
   }
   
   public static void main (String[] args)
   {
   CalculatorTricky calculatorTricky = new CalculatorTricky();
   calculatorTricky.addition(20,30);
   calculatorTricky.subtraction(50,20);
   calculatorTricky.Multiplication(5,8);
   calculatorTricky.Divison(200,100);
   calculatorTricky.display();
   }
  }
   
   
   