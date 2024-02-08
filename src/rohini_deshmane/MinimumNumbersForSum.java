package rohini_deshmane;

public class MinimumNumbersForSum {
		
	int printMinimumNumbersForDivision(int number) {
		int count=0,sum=0;

		for(int i=1; i<=number; i++) {
			if(i%6==0 && sum<=number) {
				sum= sum+i;
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		MinimumNumbersForSum minimumNumbersForSum = new MinimumNumbersForSum();
		int count = minimumNumbersForSum.printMinimumNumbersForDivision(150);
		System.out.println(count);
	}

}
