package technocredits;

class ValueConversion {

	void processData() {
		int num1 = 20;
		int num2 = 6;

		float ans1 = (float)(num1/num2);
		double ans2 = num1 /(double)num2;
		float temp = (float)num1/num2;
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(temp);
	}
	
	// 6 , 7, 9
	double findAvg(int num1, int num2, int num3) {
		double ans = ((double)num1+num2+num3)/3;
		System.out.println(ans); //7.0
		System.out.println(num1);
		return ans;
	}

	public static void main(String[] args) {
		new ValueConversion().processData();
	}
}