package aanand;

class Example2{
	int num1 = 10;
	int num2 = 20;
	
	void processData(){
		int num1 = 100;
		this.num1 = num1 + this.num1;
	}
	
	void display(){
		System.out.println(num1);	
	}
	
	public static void main(String[] args){
		Example2 example2 = new Example2();
		example2.processData();
		example2.display();
	}
}