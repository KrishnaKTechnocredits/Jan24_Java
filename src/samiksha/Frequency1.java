package samiksha;

public class Frequency1 {
	int count = 0;

	void printFreq(String name, char targetCh) {
		for (int num = 0; num < name.length(); num++) {
			name = name.toLowerCase();
			char ch = name.charAt(num);
			if (ch == targetCh) {
				count++;
			}
		}
		System.out.println("Frequency of " + targetCh + " in " + name + " is " + count);
	}

	public static void main(String[] args) {
		Frequency1 frequency1 = new Frequency1();
		frequency1.printFreq("technocrediTs teaches Technology", 't');
	}
}
