package akshada_marne;

public class StringFreqInArray {

	int getCount(String[] input, String name ) {
		int count=0;
		for(int i=0;i<input.length;i++) {
			String str=input[i];
			if(str.equalsIgnoreCase(name))
				count++;
		}
		return count;
	}

	void printFrequency(String[] input) {
		
		for(int i=0;i<input.length;i++) {
			int count=getCount(input , input[i]);
			System.out.println(input[i]+" ->"+ count);
			}
	
			}

	public static void main(String[] args) {
		StringFreqInArray stringFreqInArray=new StringFreqInArray();
		String[] arr={"techno", "credits", "samikash", "varsha", "techno"};
		stringFreqInArray.printFrequency(arr);
	}
}
