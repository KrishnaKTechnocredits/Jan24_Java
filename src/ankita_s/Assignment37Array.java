package ankita_s;

public class Assignment37Array {

	int printNameswiththeirfreq(String[] input, String tragetInput) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (tragetInput == input[index])
				count++;
		}
		return count;
	}

	boolean isProcessData(String[] str, String target, int targetIndex) {
		boolean flag = false;
		for (int index = 0; index < targetIndex; index++) {
			if (str[index].equals(target)) {
				return true;
			}
		}
		return flag;
	}

	void printAllprintNameswiththeirfreq(String[] input) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			if (!isProcessData(input, input[index], index)) {
				count = printNameswiththeirfreq(input, input[index]);
				System.out.println(input[index] + "-->" + count);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "techno", "credits", "samikash", "varsha", "techno" };
		Assignment37Array ass37 = new Assignment37Array();
		ass37.printAllprintNameswiththeirfreq(arr);
	}
}
