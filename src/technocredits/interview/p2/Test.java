package technocredits.interview.p2;

import java.util.Arrays;

public class Test {

	String[] arr; // null

	void setData() {
		arr = new String[3];
		arr[0] = "Techno";
		arr[1] = "Credits";
		arr[2] = "Pune";
		System.out.println(Arrays.toString(arr));
	}

	void m1() {
		setData();
		System.out.println("Let me update data");
		arr[0] = "Techno123";
		arr[2] = "Pune123";

		arr = new String[5];
		System.out.println(Arrays.toString(arr));
	}

	void display() {
		setData();
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.m1();
	}
}
