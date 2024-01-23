package rupali_umagol;

class Student{
	int rno=11;
	String name="Rupali";
	
	void display(){
		System.out.println(rno);
		System.out.println(name);
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.display();
	}
}