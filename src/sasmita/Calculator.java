package sasmita;

class Calculator {
	
	int num1 = 100;
	int num2 = 20;
	
	void add(){
		int ans = num1 + num2;
		System.out.println(ans);
	}
	
	void sub(){
		int ans = num1 - num2;
		System.out.println(ans);
	}
	
	void multi(){
		int ans = num1 * num2;
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
		calculator.multi();
		calculator.div();
	}
}	