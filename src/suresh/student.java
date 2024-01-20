package suresh;

class Student{
	int roll=10;
	String name ="suresh";
	
	void display(){
		System.out.println(roll);
		System.out.println(name);
	}

	public static void main(String[] args){
		Student s = new Student();
		s.display();
	}
}