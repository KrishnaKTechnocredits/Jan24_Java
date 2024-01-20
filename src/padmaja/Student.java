package padmaja;

class Student{
	int rno = 10;
	String name = "Techno";
	
	void display(){
		System.out.println(rno);
		System.out.println(name);
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.display();
	}	
}