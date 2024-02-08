package shravani_rapelli;

public class Assignment40 {
	
	boolean startWithConso(String str) {
		char ch = str.charAt(0);
		ch = Character.toLowerCase(ch);
		if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
			return true;
		}else
			return false;
	}
	
	boolean endsWithVowel(String str) {
		char ch = str.charAt(str.length()- 1);
		ch = Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}else
			return false;
	}
	
	void printNames(String[] names) {
		for(int i=0; i<names.length; i++) {
			if(startWithConso(names[i]) == true && endsWithVowel(names[i]) == true) {
				System.out.println(names[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment40 assign40 = new Assignment40();
		String names[] = {"Aashvi","Sameer","Ansh","Sveta","Anand","Techno","Garima"};
		assign40.printNames(names);
	}

}
