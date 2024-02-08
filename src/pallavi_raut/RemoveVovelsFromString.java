/*Assignment - 26 : 30th Jan'24
Remove all the vowels from given String.

input : technocredits
output : tchncrdts

-------------------------------------------*/
package pallavi_raut;
class RemoveVovelsFromString{
	
	public static void main (String[] args){
		RemoveVovelsFromString removeVovelsFromString = new RemoveVovelsFromString();
		removeVovelsFromString.printWithoutVovels("technocredits");
	}

	void printWithoutVovels (String str) {
		char ch;
		for(int index=0; index < str.length(); index++) {
			ch = str.charAt(index);
			if(ch=='a' || ch =='e'|| ch=='i'|| ch=='o' || ch =='u') {
				str = str.replace(ch, '*');
			}
		}
		str = str.replace("*", "");
		System.out.println(str);
	}
}



