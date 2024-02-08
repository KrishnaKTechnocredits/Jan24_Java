package sasmita;

public class Assignemnt37 {

	int freqFromArray(String[] arr, String str ) {
		int count =0;
		for(int index=0; index<arr.length; index++) {
			String str2 = arr[index];
			if(str2 ==str) {
				count++;
			}
		}
		return count;
	}
	void printFreq(String[] names) {
		int temp =0;
		System.out.println("Frequency of name in an array :");
		for(int index =0; index<names.length;index++) {
			temp= freqFromArray(names, names[index]);
			System.out.println("" +names[index]+ "=" +temp);
		}
		
		}
	public static void main(String[] args) {
		String[]str = {"techno", "credits", "samikash", "varsha" ,"techno"};
		new Assignemnt37().printFreq(str);
	}
	
}
