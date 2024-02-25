/*Print last character with minimum frequency:
input: aakanksha
output: h->1"*/


package shraddha;

class Assignment58{
	void minimumFrequency(String str){
		char ch =' ';
		char lastch = ' ';
		for(int i=(str.length()-1);i>=0;i--){
			ch = str.charAt(i);
			if(str.lastIndexOf(ch)==str.indexOf(ch)){
				lastch = ch;
				break;
			}
		}
		System.out.println(lastch);
	}
	
	public static void main(String[] args){
		Assignment58 last = new Assignment58();
		last.minimumFrequency("akanksha");
	}
}