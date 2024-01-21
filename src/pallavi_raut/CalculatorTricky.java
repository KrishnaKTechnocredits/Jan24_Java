/*Assignment - 2 : 16th Jan'2024
Write a program called CalculatorTricky, all 4 methods should be parameterized and write a method that will
print addition of answers get from all the methods.*/

package pallavi_raut;
class CalculatorTricky{
	int totalAmt;
	void Add( int num1,int num2){
		totalAmt=totalAmt+(num1+num2);
	}
	void Sub( int num1,int num2){
		totalAmt=totalAmt+(num1-num2);
	}
	void Mult( int num1,int num2){
		totalAmt=totalAmt+(num1*num2);
	}
	void Division( int num1,int num2){
		totalAmt=totalAmt+(num1/num2);
	}
	void Print(){
		System.out.println("Addition of all Answers is= "+ totalAmt);	
	}	
	
	public static void main (String[] args){
		CalculatorTricky Caltrick=new CalculatorTricky();
		Caltrick.Add(10,200);//210
		Caltrick.Sub(300,100);//200 
		Caltrick.Mult(10,10);//100
		Caltrick.Division(300,100);//3
		Caltrick.Print();
	}
	
}