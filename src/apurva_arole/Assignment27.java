package apurva_arole;

public class Assignment27 {
	void removeuppercasechar(String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			boolean flag= Character.isUpperCase(ch);
			if(flag==false) 
			{
				System.out.println(ch);
			}
		}
}
public static void main(String[] args) {
	Assignment27 assignment27 = new Assignment27();
	assignment27.removeuppercasechar("tEcHnoCRediTS");
	
   }
}
