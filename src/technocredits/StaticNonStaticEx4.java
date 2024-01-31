package technocredits;

class StaticNonStaticEx4{
	
	static int num1 = 10;
	int num2 = 20;
	
	int processData(){
		num1 = num1 + num2; // CE
		return num2;
	}
	
	static void updateData(){
		num1 = 100; // CE
		StaticNonStaticEx4 ex4 = new StaticNonStaticEx4();
		ex4.num2 = 200; // CE
	}
	
	void displayData(){
		System.out.println(num1 + ":" + num2); //ce
	}
	
	public static void main(String[] args){
		updateData();
		StaticNonStaticEx4 ex4 = new StaticNonStaticEx4();
		updateData();
		ex4.processData();
		ex4.displayData();
	}
}