package shravani_rapelli;

public class Assignment39 {
	
	void printAllNamesFromArray(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			String str = arr[i];
			char ch = str.charAt(0);
			if(str.length() > 5 && Character.isUpperCase(ch)) {
				System.out.println(str);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment39 assign39 = new Assignment39();
		String[] str = {"Aashvi","Sameer","Ansh","Sveta","Rina","Anand","Techno","harsh","phenol"};
		assign39.printAllNamesFromArray(str);
	}

}
