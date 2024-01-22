package akshay_gaikwad;

public class DivisibleBy7Or13Rev {
	void divisibleBy7Or13Rev(int startNum , int endNum) {
		for (int index = endNum ; index >= startNum ; index--) {
			if (index%7 == 0 && index%13 == 0) {
				System.out.println(index + " is divisible by 7 and 13");
			} else if (index%7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index%13 == 0) {
				System.out.println(index + " is divisible by 13");
			} 
		}
	}
	
	public static void main(String[] args) {
		DivisibleBy7Or13Rev divisibleby7or13rev = new DivisibleBy7Or13Rev();
		divisibleby7or13rev.divisibleBy7Or13Rev(5, 40);
	}
}
