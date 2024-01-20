package technocredits;

class Example7{
	
	int answer;
	
	void add(int num1, int num2){
		int answer = num1 + num2;
		answer = answer + answer;
		System.out.println(answer);
	}
	
	void sub(int num1, int num2){
		int answer = num1 - num2;
		answer = answer + answer;
		System.out.println(answer);
	}
	
	void display(){
		System.out.println(answer); 
	}
	
	public static void main(String[] args){
		Example7 example7 = new Example7();
		example7.add(10,20);
		example7.sub(10,8);
		example7.display();
	}
}