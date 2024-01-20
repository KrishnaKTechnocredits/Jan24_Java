package technocredits;

class Example1{
	
	int num1 = 10; //110
	int num2 = 20;
	
	void processData(){
		int num1 = 100;
		this.num1 = num1 + this.num1;
	}
	
	void display(){
		System.out.println(num1);  
	}
	
	public static void main(String[] args){
		Example1 exampel1 = new Example1();
		exampel1.display(); //10
		exampel1.processData(); //
		exampel1.display(); // 110
		System.out.println(exampel1.num1); //110
		System.out.println(exampel1.num2); // 20
	}
}