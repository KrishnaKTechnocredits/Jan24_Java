package nikita_patil;

public class Assignment38 {
	void prinMaxNum(int[] num) {
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (max < num[index]) {
				max = num[index];
			}
		}
		System.out.println("Max : " + max);
	}

	void prinMinNum(int[] num) {
		int min = num[0];
		for (int index = 0; index < num.length; index++) {
			if (min > num[index]) {
				min = num[index];
			}
		}
		System.out.println("Min : " + min);
	}
	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 60, 30 };
		Assignment38 a= new Assignment38();
		a.prinMaxNum(arr);
		a.prinMinNum(arr);
	}
}



