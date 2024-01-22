package akshay_gaikwad;

public class First3NumDivBy3And4 {
	void first3NumDivBy3And4(int startNum, int lastNum) {
		int count = 0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for (int index = startNum ; index <= lastNum ; index++) {
			if (index % 3 == 0 && index % 4 ==0) {
				System.out.println(index);
				count++;
				if (count ==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		First3NumDivBy3And4 first3numdivby3and4 = new First3NumDivBy3And4();
		first3numdivby3and4.first3NumDivBy3And4(10, 500);
	}

}
