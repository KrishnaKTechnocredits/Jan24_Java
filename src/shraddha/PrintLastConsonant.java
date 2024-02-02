/*Programming test - 2 : 02 Feb'2024
*
Print last consonant from the string*/


package shraddha;

class PrintLastConsonant{
	void lastConsonant(String str){
		char ch1=1;
		for (int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
					ch1 = ch;
		}
		System.out.println("Last consonant from given String is "+ch1);
	}
	
	public static void main(String[] args){
		PrintLastConsonant print = new PrintLastConsonant();
		print.lastConsonant("aakanksha");
	}
}