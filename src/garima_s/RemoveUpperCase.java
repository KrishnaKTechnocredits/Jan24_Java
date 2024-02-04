package garima_s;

public class RemoveUpperCase {
	void printLowerCase(String value) {
		System.out.print("Remove UpperCase from TechNoCREdits : ");
		for (int index = 0; index < value.length(); index++) {
			char ch = value.charAt(index);
			boolean flag = Character.isUpperCase(ch);
			if (flag == true) {
				value = value.replace(ch, '*');
			}
		}
		value = value.replace(String.valueOf('*'), "");
		System.out.println(value);
	}

	public static void main(String[] args) {
		new RemoveUpperCase().printLowerCase("TechNoCREdits");
	}
}
