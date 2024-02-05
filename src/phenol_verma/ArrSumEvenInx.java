package phenol_verma;

public class ArrSumEvenInx {
	void sumEvenIdx(int arr[]) {
		int sumEvenIdx = 0;
		int count = 0;
		for (int index = 1; index < arr.length; index = index + 2) {
			sumEvenIdx = sumEvenIdx + arr[index];
			count++;
			System.out.println("Even index number " + count + " - " + arr[index]);
		}
		System.out.println("Sum of even indexs number - " + sumEvenIdx);
	}

	public static void main(String[] args) {
		ArrSumEvenInx arrSumEvenInx = new ArrSumEvenInx();
		int arr[] = { 3, 6, 9, 11, 15, 20, 4, 26 };
		arrSumEvenInx.sumEvenIdx(arr);
	}
}
