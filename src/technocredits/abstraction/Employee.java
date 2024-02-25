package technocredits.abstraction;

public class Employee implements SrManager,Manager{
	
	void m1() {
		System.out.println(SrManager.id);
		System.out.println(Manager.id);
	}
	
	public static void main(String[] args) {
		new Employee().m1();
	}
}
