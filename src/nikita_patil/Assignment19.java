package nikita_patil;

public class Assignment19 {
	public static void main(String[] args) {
		Assignment19 a = new Assignment19();
		a.lettercount("technocrediTs teaches Technology", 't');
	}

	void lettercount(String input, char ch) {
		int count = 0;
		String str = input.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 't')
				count++;
		}
		System.out.println("Frequency of t in technocrediTs teaches Technology is " + count);
	}
}


