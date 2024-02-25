package technocredits.interview.p2;
import technocredits.interview.p1.B;

public class C extends B{
	protected int temp = 100;
	
	void display() {
		m1();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.x);
		c1.m1();
	}
}
