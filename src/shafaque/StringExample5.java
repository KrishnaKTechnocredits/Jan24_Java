package shafaque;

public class StringExample5 {

	void outUppercase(String str) {

		{
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				boolean flag = Character.isUpperCase(ch);
				if (flag == true) {
					String uppercase = String.valueOf(ch);
					str = str.replace(uppercase, "*");
				}

			}
			str = str.replace("*", "");
			System.out.print(str);
		}
	}

	public static void main(String[] args) {
		new StringExample5().outUppercase("TechNoCREdits");
	}

}
