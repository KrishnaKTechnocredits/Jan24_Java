package technocredits;

class Example12{
	
	void processMarks(int marks){
		if(marks <= 30){ //3
			marks = marks + 10;	//4
		} //5
		System.out.println(marks); //6 
	}
	
	public static void main(String[] args){
		Example12 example12 = new Example12(); //1
		example12.processMarks(29); //2
	}//7
}