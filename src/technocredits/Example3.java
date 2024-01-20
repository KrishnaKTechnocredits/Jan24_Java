package technocredits;

class Example3{
	
	void testKnowledge(int num1, int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", sum = " + (num1+num2));
	}
	
	void sub(int num1, int num2){
		System.out.println("num1 is " + num1 + ", num2 is " + num2 + ", subtraction = " + (num1-num2));
	}
	
	public static void main(String[] args){
		Example3 example3 = new Example3();
		example3.testKnowledge(20,30);
	}
}

//1020Techno
//30Techno

// num1 is 20, num2 is 30, sum = 50