package padmaja;

class Calculator{
		
	int num1 = 20;
	int num2 = 10;
		
	void add(){
		int ans = num1 + num2;
		System.out.println(ans);
	}
	
	void sub(){
		int ans = num1 - num2;
		System.out.println(ans);
	}
	
	void mul(){
		int ans = num1* num2;
		System.out.println(ans);
	}
	
	void div(){
		int ans = num1 / num2;
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}