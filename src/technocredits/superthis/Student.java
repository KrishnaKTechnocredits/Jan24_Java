package technocredits.superthis;

public class Student {
	static int rno;
	
	void setRno(int rno) {
		this.rno = rno;
		System.out.println("***" + this);
	}
	
	void display() {
		System.out.println("***" + this);
		System.out.println(this.rno);
	}
	
	public static void main(String[] args) {
		Student std1 = new Student();
		System.out.println("---" + std1);
		std1.setRno(10);
		
		
		Student std2 = new Student();
		System.out.println("---" + std2);
		std2.setRno(100);
		
		std2.display();
		std1.display();
		
	}
}
