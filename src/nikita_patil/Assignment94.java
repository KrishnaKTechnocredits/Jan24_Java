package nikita_patil;

public class Assignment94 {
	void toGetReverseString(String str) {
		String[] arr=str.split(" ");
		String output ="";
		for(int i=arr.length-1; i>=0; i--) {
			output=output+" "+arr[i];
		System.out.println(output.trim());
	}
	
	}

	public static void main(String[] args) {
		String input="Kajol is Working in Roche";
		new Assignment94().toGetReverseString(input);
	}

}
     
	
	