package samiksha;

public class AdjustFrontSpace {

	int getMaxLength(String[] str) {
		int maxLength = 0;
		for (int index = 0; index < str.length; index++) {
			int length = str[index].length();
			if (maxLength < length) {
				maxLength = length;
			}
		}
		return maxLength;
	}

	String getSpaceLength(String str , int maxLength) {
		int SpaceLength = maxLength - str.length();
		String output = "";      
		for (int i = 0; i < SpaceLength; i++) {
		    output = output + " ";
		}
		return output;
	}
	
	void getArrangeSpace(String str) {
		String[]arr = str.split(" ");
		int maxLength = getMaxLength(arr);
		String newoutput = "";
		for(int index=0; index<arr.length; index++) {
			String output =getSpaceLength(arr[index], maxLength);
			newoutput = output + arr[index];
			System.out.println(newoutput);
		}
	}
		
	public static void main(String[] args) {
		String input = "Hello Hi Technocredits Pune";
		new AdjustFrontSpace().getArrangeSpace(input);
	}

}
