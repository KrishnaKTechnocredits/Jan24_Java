package technocredits;

public class LoopExample1 {

	void processData() {
		for (int index = 0; index < 10; index++) {
			System.out.println(index);
		}
	}

	void m1(int num) {
		if (num % 5 == 0) {
			System.out.println(num + " is divible by 5");
		} else {
			System.out.println(num + " is not divible by 5");
		}
	}

	void m1() {
		int sum = 100; // 0 //10 //0 //10
		for (int index = 1; index <= 10; index = index + 3) {
			sum = 0;
			sum = sum + 10;
			System.out.println(sum);// 110 10 10 10
		}
		System.out.println(sum); // 0
	}

	void printNumbersDiv3(int startRange, int endRange) {
		int count = 0;
		int sum = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				count = count++;
				sum = sum + num;
			}
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println(sum / count);
	}

	void m2() {
		for (int num = 50; num <= 120; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
				break;
			}
		}
		System.out.println("Hi");
	}

	void m3(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0) 
				break;
			System.out.println(num);	
		}
	}
	
	void m4(int startRange, int endRange) {
		int count = 0;
		for(int num=startRange;num<=endRange;num++) {
			if(num%5==0) {
				System.out.println(num);
				count++;
				if(count == 5)
					break;
			}
		}
	}

	public static void main(String[] args) {
		LoopExample1 loopExample1 = new LoopExample1();
		loopExample1.m4(1, 100);
		System.out.println("End");
	}
}
