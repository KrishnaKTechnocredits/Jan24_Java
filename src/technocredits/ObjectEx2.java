package technocredits;

public class ObjectEx2 {	
	ObjectEx1 ex1;
	String temp = "Maulik";
	int x;
	
	void display() {
		int num = Integer.parseInt(temp);
		System.out.println(num);
		ex1.m1();
	}
	
	public static void main(String[] args) {
		ObjectEx2 ex2 = new ObjectEx2();
		ex2.display();
	}
}
