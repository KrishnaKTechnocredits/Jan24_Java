package nikita_patil;

public class Assignment87 {
	String toGetReverseString(String str) {
		String temp="";
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			temp=temp+ch;
		}
		return temp;
	}
	
	void toGetreverseString(String str) {
		String[] arr=str.split(" ");
		String output="";
		for(int i=0; i<arr.length; i++) {
			output=output+" "+toGetReverseString(arr[i]);
		}System.out.println(output.trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String str="Welcome to Technocredits";
		new Assignment87().toGetreverseString(str);
	}

}
