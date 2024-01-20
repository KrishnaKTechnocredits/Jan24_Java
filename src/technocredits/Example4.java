package technocredits;

class Example4{
	
	int output; //0
	String name; //null
	
	void printOutput(){
		System.out.println("Output : " + output);
		System.out.println("Name : " + name);
	}
	
	void processData(){
		int num1;
		String temp = "10";
		
		num1 = 100;
		num1 = num1 + 10;
		System.out.println(num1);
		System.out.println(temp);
	}
	
	void thinkBig(){
		int answer;
		System.out.println("Technocredits");
	}
	
	public static void main(String[] args){
		Example4 example4 = new Example4();
		example4.printOutput();
	}
}