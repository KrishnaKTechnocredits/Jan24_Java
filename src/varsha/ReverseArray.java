package varsha;

//Input- Kajol is Working in Roche
//Output- Roche in Working is Kajol

public class ReverseArray {

	String getReverseArray(String str) {
		String output = "";
		String[] arr = str.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			output = output + arr[i] + " ";
		}
		output = output.trim();
		return output;
	}

	public static void main(String[] args) {
		System.out.println(new ReverseArray().getReverseArray("Kajol is Working in Roche"));
	}
}
