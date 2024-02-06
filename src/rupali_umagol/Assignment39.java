package rupali_umagol;

public class Assignment39 {
	
	void printResult(String[] names) {
		for(int i=0;i<names.length;i++) {
			if(names[i].length()>5 && Character.isUpperCase(names[i].charAt(0)))
			System.out.println(names[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment39 assignment39=new Assignment39();
		String[] arr={"aashvi", "Sameer", "Ansh", "Sveta", "Rina", "Anand", "Techno"};
		assignment39.printResult(arr);
	}
}