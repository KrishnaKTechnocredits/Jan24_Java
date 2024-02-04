package sasmita;

public class RemoveUppercase {
	
	void removeUpper(String str) {
		for(int i=0;i<str.length(); i++) {
			char ch = str.charAt(i);
			boolean flag = Character.isUpperCase(ch);
			if(flag==false) {
				System.out.print(ch);
			}
		}
	}
public static void main(String[] args) {
	
	RemoveUppercase remove= new RemoveUppercase();
	remove.removeUpper("TechNoCREdits");
}
}
