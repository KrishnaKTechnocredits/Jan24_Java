/*Assignment - 39 : 4th Feb'2024

Print all the names from given array having length more than 5 characters and should start with upper case.

input: {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "Madhura"}
Output ; Aashvi
		 Sameer
		 Techno*/

package madhura_kulkarni;

public class Assignment39 {
	void printNamesWithUpperCase(String[] str) {
		String input="";
		System.out.println("The names from given array having length more than 5 characters and should start with upper case are:");
		for(int i=0; i<str.length;i++) {
			 input=str[i];
			 char ch= input.charAt(0);
			 if(input.length()>5 && Character.isUpperCase(ch))
			 {
				 System.out.println(str[i]);
			 }
		}
	}
	

	public static void main(String[] args) {
		String[] S= {"Aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno", "Madhura"};
		Assignment39 ass=new Assignment39();
		ass.printNamesWithUpperCase(S);
		
	}

}
