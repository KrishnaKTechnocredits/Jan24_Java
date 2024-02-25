package akshada_marne;

public class MaxChar {


		int charFreq(String str, char targetch) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch == targetch) {
					count++;
				}

			}
			return count;
		}

		void getMax(String input) {

			int count = 0;
			int max = 0;
			char ch = ' ';
			for (int i = 0; i < input.length(); i++) {
				char ch1 = input.charAt(i);

				count = charFreq(input, ch1);

				if (max < count) {
					max = count;
					ch = ch1;
				}
			}
			if (max == 1) {
				System.out.println(input + " having all unique characters");
			} 
			else {
			System.out.println(input + " -> " + ch + " -> " + max);
			}
		}

		public static void main(String args[]) {
			MaxChar maxCharFreq = new MaxChar();
			maxCharFreq.getMax("aakanksha");
			maxCharFreq.getMax("teecccchnoceredites");
			maxCharFreq.getMax("maulik");
		}
}
