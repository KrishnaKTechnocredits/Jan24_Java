package varsha.AssignmentOn4;

//Assignment - 37: 4th Feb'2024
//Print all the names with their frequency from given array.
//
//input: {"techno", "credits", "samikash", "varsha", "techno"}
//output:
//techno = 2
//credits=1
//samikash=1
//varsha=1

public class ArrayEx6 {

	int getStringCount(String[] input, String target) {
		int count = 0;
		for (int index = 0; index < input.length; index++) {
			String name = input[index];
			if (target.equals(name)) {
				count++;
				if (count > 1)
					input[index] = "";
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayEx6 arrayEx6 = new ArrayEx6();
		String[] names = { "techno", "credits", "samikash", "varsha", "techno" };
		for (int index = 0; index < names.length; index++) {
			String name = names[index];
			if (!name.equals("")) {
				int count = arrayEx6.getStringCount(names, name);
				System.out.println(name + ": " + count);
			}
		}
	}
}
