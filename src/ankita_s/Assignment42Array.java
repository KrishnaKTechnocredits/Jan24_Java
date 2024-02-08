package ankita_s;

public class Assignment42Array {

	void twoormorethantwodigits(String[] str) {
		for (int index = 0; index < str.length; index++) {
			int flag = digit(str[index]);
			boolean flag2 = atleastonedigit(str[index]);
			if (flag2 == true) {
				if (flag >= 2) {
					System.out.println(str[index]);
				}
			}
		}
	}

	int digit(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean temp = Character.isDigit(ch);
			if (temp == true) {
				count++;
			}
		}
		return count;
	}

	boolean atleastonedigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (Character.isDigit(ch1) == true)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String[] arr = { "Aakansha", "Aas3hvi", "Is45ha", "I2sh4a4n", "Var2sha" };
		Assignment42Array ass42 = new Assignment42Array();
		ass42.twoormorethantwodigits(arr);
	}
}
