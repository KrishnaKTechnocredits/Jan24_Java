package dharma;

public class Assignment69 {

	int maxLength=0;
	int getMaxLength(String[] arr) {
		for(int index=0; index<arr.length;index++) {
			if(arr[index].length()>maxLength) {
			maxLength=arr[index].length();
			}
		}
		return maxLength;
	}
	String getWord(String word,int maxLength) {
	String output="";
	int requiredSpace=maxLength-word.length();
		for(int index=0; index<requiredSpace;index++) {
			output= output+" ";


		}
		output= output+word;
		return output;
	}
	void processData() {
		String input = "Hello Hi Technocredits Pune";
		String[]arr= input.split(" ");
		int maxLength=getMaxLength(arr);
		for(int i=0; i<arr.length; i++) {
			String output= getWord(arr[i], maxLength);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		Assignment69 assignment69= new Assignment69();
		assignment69.processData();
	}
}
