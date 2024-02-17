package akshada_marne;

public class UniqueVowels {
	

	void vowel(String str){ 
		for(int index = 0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				if(str.indexOf(ch)==str.lastIndexOf(ch))
				System.out.println(ch);
			}
			
		}
	}
	


	public static void main(String[] args) {
 UniqueVowels uniqueVowels=new UniqueVowels();
		uniqueVowels.vowel("technocredits");
		
		}
}


	
	//if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' && str.indexOf(ch)==str.lastIndexOf(ch)){ 
