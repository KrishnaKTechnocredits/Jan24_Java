package technocredits;

class Example6{
	
	int answer;
	
	void add(int num1, int num2){
		int temp = num1 + num2;
		answer = answer + temp;
	}
	
	void sub(int num1, int num2){
		int temp = num1 - num2;
		answer = answer + temp;
	}
	
	void display(){
		System.out.println(answer); // 30 + 2
	}
	
	public static void main(String[] args){
		Example6 example6 = new Example6();
		example6.add(10,20);
		example6.sub(10,8);
		example6.display();
	}
}