package technocredits;

class Example5{
	
	int balance = 1000;
	
	void m1(int amt){
		balance = balance + amt;
	}
	
	void m2(int amt){
		balance = balance - amt;
	}
	
	void printBalance(){
		System.out.println(balance);
	}
	
	public static void main(String[] args){
		Example5 example5 = new Example5();
		example5.m1(300);
		example5.m1(200);
		example5.m2(800);
		example5.printBalance();
	}
}