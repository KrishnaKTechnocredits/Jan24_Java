package akshada_marne;

class Student {
	int rollno=1;
	String name="Student Name";

	void printInfo(){
		System.out.println(rollno);
		System.out.println(name);
	}

	public static void main(String args[]){
		Student s = new Student();
		s.printInfo();
	}
}