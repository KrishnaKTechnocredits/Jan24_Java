package shafaque;

public class Assignment70 {
		int getMaxLengthCount(String[] input) {
			int maxCount = 0;
			for (int i = 0; i < input.length; i++) {
				if (input[i].length() > maxCount) {
					maxCount = input[i].length();
				}
			}
			return maxCount;
		}

		String getStringWithRightAligned(String str, int count) {
			String output = "";
			int requiredSpaces = count - str.length();
			for (int i = 0; i < requiredSpaces; i++) {
				output = output + " ";
			}
			return output + str;

		}

		String getDigitFirst(String str) {
			String output1 = "";
			String output2 = "";
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					output1 += str.charAt(i);
				} else
					output2 += str.charAt(i);
			}
			return output1 + output2;

		}

		void displayStringWithDigitFirst(String[] str) {
			String resultString = "";
			int count = getMaxLengthCount(str);
			for (int i = 0; i < str.length; i++) {

				resultString = getStringWithRightAligned(getDigitFirst(str[i]), count);
				System.out.println(resultString);
			}
		}

		public static void main(String[] args) {

			String input = "H5el6lo Hi Tech3noc2redits Pu1ne";
			String[] input1 = input.split(" ");
			new Assignment70().displayStringWithDigitFirst(input1);
		}
	}


