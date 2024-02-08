package ankita_s;

public class Assignment43Array {

	void atleastonespecialcharacter(String[] str) {
		for (int index = 0; index < str.length; index++) {
			boolean flag2 = tocheckupperloweranddigit(str[index]);
			if (flag2 == true) {
				System.out.println(str[index]);
			}
		}
	}

	boolean tocheckupperloweranddigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean temp = Character.isDigit(ch);
			boolean temp1 = Character.isUpperCase(ch);
			boolean temp2 = Character.isLowerCase(ch);
			if (temp != true && temp1 != true && temp2 != true)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String[] arr = { "Aaka$nsha", "Aas-hvi", "Is45ha", "I2sh4a4n", "Var#s-ha" };
		Assignment43Array ass43 = new Assignment43Array();
		ass43.atleastonespecialcharacter(arr);
	}
}
