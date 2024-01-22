package shraddha;

class Student {
	int rollNo = 10;
	String name= "ABC";
 
	void print(){
		System.out.println(rollNo);
		System.out.println(name);
    }
	
	void processData(){
		System.out.println(name);
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.print();
	}
}