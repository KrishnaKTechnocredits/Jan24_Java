package shramika_vaidya;

public class IfUppercaseMoreThanLowerCaseChar {

	int getUppercase(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
				count++;
			}
		}
		return count;
	}

	int getLowercase(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isLowerCase(ch);
			if (flag == true) {
				count++;
			}
		}
		return count;
	}

	void printdata(String[] names) {
		for (int i = 0; i < names.length; i++) {
			if (getUppercase(names[i]) > getLowercase(names[i])) {
				System.out.println(names[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		new IfUppercaseMoreThanLowerCaseChar().printdata(arr);
	}
}
