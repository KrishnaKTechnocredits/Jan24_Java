package kanchan_ghuge;

/*Assignment - 37: 4th Feb'2024
Print all the names with their frequency from given array.
 
input: {"techno", "credits", "samikash", "varsha"}
*/

class Assignment37 { 

	int getFreqOfNames(String[] name) {
		int count = 0;
		for (int index = 0; index < name.length; index++) {
			count++;
			System.out.println(name[index]);
		}
		System.out.println("Total frequency of names = " + count);
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "techno", "credits", "samikash", "varsha" };
		new Assignment37().getFreqOfNames(arr);
	}
}
