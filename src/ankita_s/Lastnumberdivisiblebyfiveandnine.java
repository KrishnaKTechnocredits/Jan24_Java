package ankita_s;

public class Lastnumberdivisiblebyfiveandnine {
	int count = 0;

	void printLastnumberdivisiblebyfiveandnine(int startindex, int endindex) {
		for (int num = startindex; num <= endindex; num++) {
			if (num % 5 == 0 && num % 9 == 0)
				count = num;
		}
		System.out.println("Last no divisible by " + startindex + " and " + endindex + " is " + count);
	}

	public static void main(String[] args) {
		Lastnumberdivisiblebyfiveandnine lastnumberdivisiblebyfiveandnine = new Lastnumberdivisiblebyfiveandnine();
		lastnumberdivisiblebyfiveandnine.printLastnumberdivisiblebyfiveandnine(5, 100);
	}
}
