package ankita_s;

public class Assignment96 {
	void getFirst10FibnoaciNum(int number) {
		int temp = 0;
		int num = 1;
		int sum = 0;
		System.out.println(temp);
		for (int i = 2; i < number; i++) {
			sum = temp + num;
			temp = num;
			num = sum;
			System.out.println(sum);
		}
	}

	void getFibnoaciNumTill100(int number) {
		int temp = 0;
		int num = 1;
		int sum = 0;
		System.out.println(temp);
		for (int i = 2; i < number; i++) {
			sum = temp + num;
			temp = num;
			num = sum;
			if (sum < 100) {
				System.out.println(sum);

			}
		}
	}

	void getFibnoaciNumBetween50And100(int number) {
		int temp = 0;
		int num = 1;
		int sum = 0;
		for (int i = 2; i < number; i++) {
			sum = temp + num;
			temp = num;
			num = sum;
			if (sum > 50 && sum < 100) {
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		Assignment96 ass96 = new Assignment96();
		System.out.println("Fibnoiaci Seriers first 10 Numbers : ");
		ass96.getFirst10FibnoaciNum(10);
		System.out.println("Fibnoiaci Seriers till 100 : ");
		ass96.getFibnoaciNumTill100(30);
		System.out.println("Fibnoiaci Seriers Between 50 and 100 : ");
		ass96.getFibnoaciNumBetween50And100(30);
	}
}
