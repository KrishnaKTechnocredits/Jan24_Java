/*Assignment - 1 : 15th Jan'2024

Write a Calculator program having 4 method to perform addition, subtraction, multiplication and division with 2 instance variables

output should be: 
num1 is 20, num2 is 30, addition = 50
num1 is 50, num2 is 22, subtraction = 28
num1 is 200, num2 is 10, division = 20
num1 is 50, num2 is 5, multiplication = 250
*/
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
			


