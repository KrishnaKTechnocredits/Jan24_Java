package ankita_s;

public class Assignment55 {

	int frquency(String input, char letter) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (letter == ch) {
				count++;
			}
		}
		return count;
	}

	void displaycharacters(String input) {
		for (int i = 0; i < input.length(); i++) {

			char chart = input.charAt(i);
			int count = frquency(input, chart);
			if (count == 2)
				if (input.indexOf(chart) == i) {
					System.out.print(chart);
				}
		}
	}

	public static void main(String[] args) {
		String arr = "teecccchhhnno";
		Assignment55 ass55 = new Assignment55();
		System.out.println("Below are the character having the freq exact two:-");
		ass55.displaycharacters(arr);
	}
}
