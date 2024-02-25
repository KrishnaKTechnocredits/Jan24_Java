package technocredits.p1;

public class Student{
	String name;
	int rno;
	String city;
	
	void setData(String name, int rno, String city) {
		this.name = name;
		this.rno = rno;
		this.city = city;
	}
	
	public String toString() {
		return name + "->" + rno;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setData("Techno", 1, "Pune");
		System.out.println(student);
		
		Student student1 = new Student();
		student1.setData("Techno", 1, "Pune");
		System.out.println(student1);
		
		System.out.println(student.toString().equals(student1.toString()));
		
		String str = new String("Credits");
		System.out.println(str);
	}
}
