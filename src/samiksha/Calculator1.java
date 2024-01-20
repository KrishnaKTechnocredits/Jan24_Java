package samiksha;

class Calculator1{
    
	void add(int num1,int num2){
	   int ans= num1+num2;
	   System.out.println("num1 is "+ num1+ " , num2 is " + num2+" , sum is--> "+ ans);
	}
	void sub(int num1,int num2){
	   int ans= num1-num2;
	   System.out.println("num1 is "+ num1+ " , num2 is " + num2+" , sub is--> "+ ans);
	}
	void mul(int num1,int num2){
	   int ans= num1*num2;
	   System.out.println("num1 is "+ num1+ " , num2 is " + num2+" , mul is--> "+ ans);
	}
	void div(int num1,int num2){
	   int ans= num1/num2;
	   System.out.println("num1 is "+ num1+ " , num2 is " + num2+" , div is--> "+ ans);
	}
	public static void main(String[]args){
	   Calculator1 calculator1= new Calculator1();
	   calculator1.add(20,30);
       calculator1.sub(50,22);
	   calculator1.mul(50,5);
	   calculator1.div(200,10);
	}
}