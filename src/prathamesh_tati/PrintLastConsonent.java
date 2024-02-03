package prathamesh_tati;

//Programming Test 2: Print last consonent from given string -  aakanksha   --> h

class PrintLastConsonent{
	void getLastConsonentFromString(String str){
		str = str.toLowerCase();
		for(int index = str.length()-1; index >= 0 ; index --){
			char ch = str.charAt(index);
			
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
				System.out.println(ch);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		PrintLastConsonent printLastConsonent = new PrintLastConsonent();
		printLastConsonent.getLastConsonentFromString("aakanksha");
	}
}