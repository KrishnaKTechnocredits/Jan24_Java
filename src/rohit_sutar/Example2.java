package rohit_sutar;

class Example2{
	int answer = 0;
	
	void processData(){
		int answer = 10;
		this.answer = 10+20;
	}
	
	void display(){
		System.out.println(answer);
	}
	
	public static void main(String args[]){
		Example2 example2 = new Example2();
		example2.processData();
		example2.display();
	}
}
