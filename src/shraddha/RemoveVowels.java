/*Assignment - 27 : 30th Jan'24
Remove all the vowels from given String.
*/
package shraddha;

class RemoveVowels{
	void processString(String str){
		str = str.toLowerCase();
		char str1;
		for (int i=0;i<str.length();i++){
			str1 = str.charAt(i);
			if(str1=='a' || str1=='e' || str1=='i' || str1=='o' || str1=='u')
				str = str.replace(str1,'*');
		}
		
		String str2 = str.replace("*","");
		System.out.println(str2);
	}
	
	public static void main(String[] args){
		RemoveVowels removeVowels = new RemoveVowels();
		removeVowels.processString("TechnoCredits");
	}
}