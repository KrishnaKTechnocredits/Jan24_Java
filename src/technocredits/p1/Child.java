package technocredits.p1;

public class Child extends Parent {
	static int x = 1;
	
	public int m1() {
		System.out.println("Hello");
		return 10;
	}
	
	static void m2() {
		System.out.println("Child m2");
	}
	
	public static void main(String[] args) {
		Parent.m2();
		Child.m2();
		Parent p1 = new Parent();
		p1.m2();
		
		Parent p2 = new Child();
		p2.m2();
		
		System.out.println(p1);
		System.out.println(p2);
		
		//Parent.m3();
		Child.x = 100; 
		System.out.println(Parent.x);
		System.out.println(Child.x);
	}
}
