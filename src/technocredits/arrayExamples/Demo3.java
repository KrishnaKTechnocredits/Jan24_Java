package technocredits.arrayExamples;

public class Demo3 {

	public static void main(String[] args) {
		String[] strNames = { "1iop213jp", "324hjk", "1049bjk", "821haslk", "hawpo" };
		String output[] = m1(strNames);
		for (int i = 0; i < output.length; i++) {
			if (output[i] != null)
				System.out.println(output[i]);
		}
	}

	static String[] m1(String[] strNames) {
		String output[] = new String[strNames.length];
		for (int i = 0; i < strNames.length; i++) {
			String str = isSumGreatherThan7(strNames[i]);
			if (str != "")
				output[i] = str;
		}
		return output;
	}

	static String isSumGreatherThan7(String str) {
		boolean isNumericPResent = isNumericPResent(str);
		if (isNumericPResent) {
			int sum = doSumOfNumericInString(str);
			if (sum > 7) {
				return str;
			}
		}
		return "";
	}

	static int doSumOfNumericInString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	static boolean isNumericPResent(String alphnUmeric) {
//		boolean isNumerPresent = false;
		for (int i = 0; i < alphnUmeric.length(); i++) {
			if (Character.isDigit(alphnUmeric.charAt(i))) {
//				isNumerPresent = true;
//				break;
				return true;
			}
		}
		return false;
//		return isNumerPresent;
	}

}
