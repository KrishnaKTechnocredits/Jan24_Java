package ankita_s;

public class Firstthreenodivisiblebythreeandfour {
	int count = 0;
	int num;

	void printFirstthreenodivisiblebythreeandfour(int firstindex, int lastindex) {
		for (num = firstindex; num <= lastindex; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
				if (count == 3)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Firstthreenodivisiblebythreeandfour firstthreenodivisiblebythreeandfour = new Firstthreenodivisiblebythreeandfour();
		System.out.println("First 3 numbers divisible by 3 and 4 is:-");
		firstthreenodivisiblebythreeandfour.printFirstthreenodivisiblebythreeandfour(10, 500);
	}
}
