/*Input- Kajol is Working in Roche
Output- Roche in Working is Kajol*/
package rupali_umagol;

public class Assignment94 {
	String getReverseString(String[] arr) {
		String str = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			str += arr[i] + " ";
		}
		return str.trim();
	}

	public static void main(String[] args) {
		String input = "Kajol is Working in Roche";
		System.out.println("Input String : " + input);
		String[] arr = input.split(" ");
		String output = new Assignment94().getReverseString(arr);
		System.out.println("Reverse String :" + output);
	}
}
