package hiral_purohit;
/*Assignment - 94 : 25th March'2024 [18-20 mins] 
Input- Kajol is Working in Roche
Output- Roche in Working is Kajol*/

public class Assignment_94 {
	
	void toGetReverseString(String str) {
		String[] arr=str.split(" ");
		String output ="";
		for(int i=arr.length-1; i>=0; i--) {
			output=output+" "+arr[i];
		}System.out.println(output.trim());
	}
	
	
	public static void main(String[] args) {
		String input="Kajol is Working in Roche";
		new Assignment_94().toGetReverseString(input);
	}

}
