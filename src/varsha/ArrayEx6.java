package varsha;

public class ArrayEx6 {

	int getStringCount(String[] input, String target) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			if (target.equals(name)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayEx6 arrayEx6 = new ArrayEx6();
		String[] names = { "techno", "credits", "samikash", "varsha", "techno" };
		for (int index = 0; index < names.length; index++) {
			String name = names[index];
			int count = arrayEx6.getStringCount(names, name);
			System.out.println(name + ": " + count);
		}
	}
}
