package gaurav_garg;
class Calculator
{
	void add(int a , int b)
	{
		System.out.println("num1 is "+a+",numb2 is "+b+",additioon = "+(a+b));
	}
	
	void subtraction(int a , int b)
	{
		System.out.println("num1 is "+a+",numb2 is "+b+",subtraction = "+(a-b));
	}
	
	void division(int a , int b)
	{
		System.out.println("num1 is "+a+",numb2 is "+b+",division = "+(a/b));
	}
	void multiplication(int a , int b)
	{
		System.out.println("num1 is "+a+",numb2 is "+b+",multiplication = "+(a*b));
	}
	
	
 public static void main(String...s)
 {
	 Calculator calculator=new Calculator();
	 calculator.add(20,30);
	 calculator.subtraction(50,22);
	 calculator.division(200,10);
	 calculator.multiplication(50,5);
	
 }
 
}
