package rupali_umagol;

public class Assignment19 {
	
	String name;
	int count;
	void frequency(String name, char value) {
		String output=name.toLowerCase();
		for(int index=0; index<output.length(); index++) {
		if(output.charAt(index) == value)
			count++;
		}
		System.out.println("frequency of t in technocredits is " + count);
	}
	
	public static void main(String[] args) {
		Assignment19 assignment19=new Assignment19();
		assignment19.frequency("technocrediTs teaches Technology.", 't');
	}

}
