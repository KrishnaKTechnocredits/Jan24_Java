package technocredits.arrayExamples;

public class Demo1 {

	int a[];

	void m1(int h) {
		System.out.println(a.length);
	}

	public static void main(String[] args) {
//		int v = 30;
//		int e = v;
//
//		int str[] = { 1, 5, 9, 2, 7,10,15,89 };
//		int str1[] = str;
//		

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = new int[] { 1, 2, 3, 4, 5 };
		double c[] = new double[5];

		double aa[] = { 12.30, 9 };
		boolean bArray[] = { true, false, true, false };

		// Init with 0 or empty array
		int d[] = { 5 };
		d[0] = 8;
		String str[] = new String[4];
//		 int e[] = new int[] {};
//		 int f[] = new int[0];

		System.out.println(d);

		for (int i = 0; i < c.length; i++) {
			c[i] = i;
			System.out.println(c[i]);
		}
	}
}
