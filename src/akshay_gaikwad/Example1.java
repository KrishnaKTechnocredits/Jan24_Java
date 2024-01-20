package akshay_gaikwad;

class Example1{

	int num1 = 10;
	int num2 = 20;
	
	void m1(){
		
		num1 = 50;
		Example1 e1 = new Example1();
		Example1 e2 = new Example1();
		
		e1.num1 = 100;
		e2.num2 = 200;
		
		System.out.println("E1 Num1 : " + e1.num1);
		System.out.println("E1 Num2 : " + e1.num2);
		System.out.println("E2 Num1 : " + e2.num1);
		System.out.println("E2 Num2 : " + e2.num2);
	
	}
	
	public static void main(String[] args){
		
		Example1 example1 = new Example1();
		example1.m1();
	}

}