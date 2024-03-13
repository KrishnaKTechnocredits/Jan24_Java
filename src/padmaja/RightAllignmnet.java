/*Assignment - 69 Right Alligned Output
 * String str = "Hel12lo Hi Technocredits Pune";
output:
        Hello
           Hi
Technocredits
         Pune
           */

package padmaja;

public class RightAllignmnet {

	int getMaxLenght(String[] str) {
		int maxLength = 0;
		for (int index = 0; index < str.length; index++) {
			int length = str[index].length();
			if (maxLength < length)
				maxLength = length;
		}
		return maxLength;
	}

	String getSpaceLength(String str, int maxLength) {
		int spaceLength = maxLength - str.length();
		String spaceOutput = "";
		for (int index = 0; index < spaceLength; index++) {
			spaceOutput = spaceOutput + " ";
		}
		return spaceOutput;
	}

	void rightAllignedOutput(String[] arr) {
		int maxLength = getMaxLenght(arr);
		String finalOutput = "";
		for (int index = 0; index < arr.length; index++) {
			String spaceOutput = getSpaceLength(arr[index], maxLength);
			finalOutput = spaceOutput + arr[index];
			System.out.println(finalOutput);
		}
	}

	public static void main(String[] args) {
		String input = "Hello Hi Technocredits Pune";
		String[] arr = input.split(" ");
		new RightAllignmnet().rightAllignedOutput(arr);
	}
}
