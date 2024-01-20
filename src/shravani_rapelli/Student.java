package shravani_rapelli;

class Student{
	int rno=10;
	String nm="Techno";
	
	void display(){
		System.out.println(rno);
		System.out.println(nm);
	}
	
	public static void main(String[] args){
		Student s = new Student();
		s.display();
	}
}