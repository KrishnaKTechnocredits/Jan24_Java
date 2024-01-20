package aanand;

class Student{
	
	int rno = 10;
	String name = "Anand";
	
	void display(){
		System.out.println(rno);
		System.out.println(name);
	}
	
	void processData(){
		System.out.println(name);
	}
	public static void main(String[] args){
		Student s = new Student();
		s.display();
		s.processData();
	}
}