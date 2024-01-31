package technocredits;

class Example14{
	
	void processMarks(int marks){
		if(marks <= 30){ //3
			marks = marks + 10;	//4
		} //5
		System.out.println(marks); //6 
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		Example14 example12 = new Example14(); //1
		example12.processMarks(29); //2
	}//7
}