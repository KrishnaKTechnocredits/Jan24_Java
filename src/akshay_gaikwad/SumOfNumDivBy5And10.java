package akshay_gaikwad;

public class SumOfNumDivBy5And10 {
	void sumOfNumDivBy5And10(int startNum ,int endNum) {
		int sum = 0;
		for (int index = startNum ; index < endNum ; index++) {
			if (index%5 == 0 && index%10 == 0) {
				sum += index;
			}
		}
		System.out.println("Sum : "+ sum);
	}
	
	public static void main(String[] args) {
		SumOfNumDivBy5And10 sumofnumdivby5and10 = new SumOfNumDivBy5And10();
		sumofnumdivby5and10.sumOfNumDivBy5And10(10, 50);
	}

}
