package sveta;

public class Assignment_37_Frequency {

	public int frequencyCount(String[] arr,String targetStr) {
		int count=0;
		for (String element : arr) {
			if(targetStr == element) 
				count++;
		}
		return count;
	}

	boolean getStringFreq(String[] arr,String str,int targetStr) {
		boolean flag=false;
		for(int input=0;input<targetStr;input++) {
			if(arr[input].equals(str)) 
				return true;
		}
		return flag;
	}

	public void stringPrint(String[] arr) {
		for(int j=0;j<arr.length;j++) {
			if(!getStringFreq(arr, arr[j], j)) 
				System.out.println(arr[j] + " -> " + frequencyCount(arr,arr[j]));
		}
	}

	public static void main(String[] args) {
		String[] arr = {"techno", "credits", "samikash", "varsha", "techno"};
		Assignment_37_Frequency frequencyCount= new Assignment_37_Frequency();
		frequencyCount.stringPrint(arr);
	}
}
