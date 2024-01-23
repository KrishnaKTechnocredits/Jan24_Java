//On user defined range print all numbers which are divisible by 5 and divisible by 3.

package akshay_gaikwad;

public class DivisibleBy5And3 {
	void divisibleBy5and3 (int startNum , int endNum) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int index = startNum ; index <= endNum ; index++) {
			if (index%3 == 0 && index%5 == 0) {
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args) {
		DivisibleBy5And3 divisibleby5and3 = new DivisibleBy5And3();
		divisibleby5and3.divisibleBy5and3(5, 40);
	}

}
