package akshay_gaikwad;

class Student {

	int rno = 18;
	String name = "Akshay";
	
	void display(){
	
		System.out.println(rno);
		System.out.println(name);
	}
	
	public static void main(String args[]){
		Student s = new Student();
		s.display();
	}

}