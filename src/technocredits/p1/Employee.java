package technocredits.p1;

public class Employee extends Manager{
	
	int x = 1;
	int y = 2;
	
	void display() {
		System.out.println(name);
		m2();
	}
	
	void m2() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		Manager mng = new Employee();
		mng.m1();
		mng.display();
		
	}
}

