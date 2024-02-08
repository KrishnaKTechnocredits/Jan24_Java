package rupali_umagol;

public class Assignment37 {
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
		Assignment37 assignment37=new Assignment37();
		String[] arr={"techno", "credits", "samikash", "varsha", "techno"};
		assignment37.printFrequency(arr);
	}
}