package pallavi_raut;
class CalculatorParam{

		void addition(int num1,int num2)
		{
		 System.out.println("Num1 is " + num1 + ", Num2 is "  +num2 +", addition =" +(num1+num2));
		}
		void subtraction(int num1,int num2)
		{
			System.out.println("Num1 is " + num1 + ", Num2 is "  +num2 +", subtraction =" +(num1-num2));
		}	
		void multiplication(int num1,int num2)
		{
		 System.out.println("Num1 is " + num1 + ", Num2 is "  +num2 +", multiplication =" +(num1*num2));
		}
		void division(int num1,int num2)
		{
			System.out.println("Num1 is " + num1 + ", Num2 is "  +num2 +", division =" +(num1/num2));
		}	
		 
		 public static void main (String[]args)
		 {
			CalculatorParam calparam= new CalculatorParam();
			calparam.addition(20,30);
			calparam.subtraction(50,22);
			calparam.division(200,10);
			calparam.multiplication(50,5);
		 }
}
			


