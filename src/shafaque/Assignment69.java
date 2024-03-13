package shafaque;

public class Assignment69 {
		int getMaxLengthOfWord(String[] str) {
			int max = 0;
			for (int i = 0; i < str.length; i++) {
				if (str[i].length() > max) {
					max = str[i].length();
				}
			}
			return max;
		}

		String printWord(String str, int count) {
			String output = "";
			count = count - str.length();
			for (int i = 0; i < count; i++) {
				output = output + " ";
			}
			output = output + str;
			return output;
		}

		void getAllmethods(String[] str) {
			int count = getMaxLengthOfWord(str);
			for (int i = 0; i < str.length; i++) {
				String output = printWord(str[i], count);
				System.out.println(output);
			}
		}

		public static void main(String[] args) {
			Assignment69 assignment69 = new Assignment69();
			String input = "Hi Hello Technocredits Pune";
			String[] arr = input.split(" ");
			assignment69.getAllmethods(arr);
		}
	}

