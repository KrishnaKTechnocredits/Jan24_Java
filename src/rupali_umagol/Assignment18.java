package rupali_umagol;

public class Assignment18 {
	void reverse(String name) {
		for(int index=name.length()-1;index>=0;index--) {
			System.out.println(name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Assignment18 assignment=new Assignment18();
		assignment.reverse("techno");
	}

}
