package dharma;

public class ReturnSumOfEvenEx1 {

	void sumIndex(int[] Values) {
		int sum = 0;
		for(int i=0;i<Values.length;i++) {
			if(Values[i]%2 == 0) {
				//System.out.println(sum);
				sum = sum + Values[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		ReturnSumOfEvenEx1 returnsumofevenex1 = new ReturnSumOfEvenEx1();
	    int[] arr= {3, 6, 9, 11, 15, 20, 4, 26};
	    returnsumofevenex1.sumIndex(arr);

	}

}
