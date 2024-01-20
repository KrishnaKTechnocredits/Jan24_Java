package madhura_kulkarni;

class Calculator{
	
void Addition(int n1, int n2){
System.out.println("num1 is " + n1 + ", num2 is " + n2 + ", addition = " + (n1 + n2));
}

void Subtraction(int n1, int n2){
System.out.println("num1 is " + n1 + ", num2 is " + n2 + ", subtraction = " + (n1 - n2));
}

void Division(int n1, int n2){
System.out.println("num1 is " + n1 + ", num2 is " + n2 + ", division = " + (n1 / n2));
}

void Multiplication(int n1, int n2){
System.out.println("num1 is " + n1 + ", num2 is " + n2 + ", multiplication = " + (n1 * n2));
}
	

public static void main(String[] args){
Calculator calculator=new Calculator();
calculator.Addition(20,30);
calculator.Subtraction(50,22);
calculator.Division(200,10);
calculator.Multiplication(50,5);
}
}