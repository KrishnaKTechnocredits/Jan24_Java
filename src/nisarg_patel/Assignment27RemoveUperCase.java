package nisarg_patel;

public class Assignment27RemoveUperCase {

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
		new Assignment27RemoveUperCase().printLowerCase("TechNoCREdits");
	}
}
