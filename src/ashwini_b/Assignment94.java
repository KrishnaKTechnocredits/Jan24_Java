package ashwini_b;

/*
 Assignment - 94 : 25th March'2024 [18-20 mins] 
Input- Kajol is Working in Roche
Output- Roche in Working is Kajol
 */
public class Assignment94 {

	void rearrangeWord(String[] inputArray) {
		String str = "";
	//	String[] outputArray = new String[inputArray.length];
		for (int index = inputArray.length - 1; index >= 0; index--) {
			str = str + inputArray[index] + " ";
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "Kajol is Working in Roche";
		String[] array = str.split(" ");
		Assignment94 assignment94 = new Assignment94();
		assignment94.rearrangeWord(array);
	}
}
