package technocredits;

class ArrExample2 {
	
	void add(int[] num){
		num[0] = 100;
	}
	
	void m1(int x) {
		x = 200;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		ArrExample2 arrExample2 = new ArrExample2();
		System.out.println(arr[0]);
		arrExample2.add(arr);
		System.out.println(arr[0]);
	
		int y = arr[0];
		arrExample2.m1(y);
		System.out.println(y);
	}
}
