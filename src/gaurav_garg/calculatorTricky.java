class CalculatorTricky
{
	int sum;
void addition(int a ,int b)
{
	int n=a+b;
	sum =sum+n;
}
void subtract(int a, int b)
{
	int n= a-b;
     sum = sum +n;	
}

void multiply(int a, int b)
{
	int n = a*b;
	sum = sum+n;
}
void division(int a ,int b)
{
	int n =a/b;
	sum = sum +n;
}
void display()
{
	System.out.println(sum);
}
public static void main(String...s)
{
CalculatorTricky calculatortricky =new CalculatorTricky();
calculatortricky.addition(2,3);
calculatortricky.subtract(10,6);
calculatortricky.multiply(10,10);
calculatortricky.division(10,2);
calculatortricky.display();
}
}