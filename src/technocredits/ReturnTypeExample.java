package technocredits;

class ReturnTypeExample {

	int x = 10;
	float num = x;

	int processData() {
		int output = 20 + 30;
		return output;
	}

	public static void main(String[] args) {
		ReturnTypeExample returnTypeEx = new ReturnTypeExample();
		float f = returnTypeEx.processData();
		System.out.println(f);
	}
}