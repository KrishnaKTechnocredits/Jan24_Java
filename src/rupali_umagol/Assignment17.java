package rupali_umagol;

public class Assignment17 {
	void frequence(String name, char value) {
		int count=0;
		for(int index=0 ; index<name.length(); index++) {
			if(name.charAt(index) == value)
				count++;		
		}
		System.out.println(" frequency of t in technocredits is " + count);
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17=new Assignment17();
		assignment17.frequence("technocredits", 't');
	}
}
