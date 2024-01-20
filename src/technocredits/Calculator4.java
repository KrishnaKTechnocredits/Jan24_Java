package technocredits;

class Calculator4{
	
	void add(int num1,int num2){
		System.out.println("Sum is " + (num1 + num2));
	}
	
	void sub(int num1, int num2){
		int ans = num1 - num2;
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		Calculator4 calculator = new Calculator4();
		calculator.add(15,30);
		calculator.add(10,50);
		calculator.add(500,650);
	}
}

//1. CE
//2. Sum is 45
//3. Sum is 1530