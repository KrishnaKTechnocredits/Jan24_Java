package suresh;

public class RemoveAllUppercaseCharacter 
{
	void removeUpperCase(String index) {
		for (int i = 0; i < index.length(); i++) {
			char ch = index.charAt(i);
			boolean value = Character.isUpperCase(ch);
			if (value == true) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		new RemoveAllUppercaseCharacter().removeUpperCase("TechNoCREdits");
	}
}
