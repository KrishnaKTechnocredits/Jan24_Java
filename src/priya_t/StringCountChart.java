package priya_t;

public class StringCountChart {

	void printchar(String input, char targetchar) {
		int count = 0;
		String ConvertedString = input.toLowerCase();

		for (int index = 0; index < ConvertedString.length(); index++)

		{

			char ch = ConvertedString.charAt(index);

			if (ch == targetchar)
				count++;

		}

		System.out.println("Char:" + targetchar);
		System.out.println("Output:frequency of t in technocredits is " + count);

	}

	public static void main(String[] args) {
		StringCountChart count = new StringCountChart();
		count.printchar("technocrediTs teaches Technology", 't');

	}

}
