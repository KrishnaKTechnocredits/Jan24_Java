package phenol_verma;

class Student {
	int rno = 10;
	String name = "Phenol Verma";
	
	void display(){
			System.out.println(rno);
			System.out.println(name);
	}
	
	public static void main(String[] args){
			Student stu = new Student();
			stu.display();
		
	}
}