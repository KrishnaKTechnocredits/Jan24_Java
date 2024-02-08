package akshada_marne;

public class UniqueChar {
		int getFreq(String str, char ch) {
			int count = 0;
			for (int index = 0; index < str.length(); index++)
				if (str.charAt(index) == ch) {
					count++;
				}
			return count;
		}

		void printUniqueChar(String str) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (getFreq(str, ch) == 1) {
					System.out.print(ch);
				}
			}
		}

		public static void main(String[] args) {
			UniqueChar uniqueChar = new UniqueChar();
			//System.out.print("Output is:- ");
			uniqueChar.printUniqueChar("technocredits");
		}
	}

