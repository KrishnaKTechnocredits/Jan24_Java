package varsha;

public class NumDivisibleBy6 {
	
	void findNumDivBy6(int startIndex) {
		int count = 0;
		int sum = 0;
		int index = startIndex;
		while(sum <= 150) {
			if (index%6 == 0) {
				sum = sum + index;
				count++;
			}
			index++;
		}
		System.out.println("Mininum num is : " + count);
	}
	
	public static void main(String[] args) {
		NumDivisibleBy6 numDivisibleBy6 = new NumDivisibleBy6();
		numDivisibleBy6.findNumDivBy6(1);
	}

}
