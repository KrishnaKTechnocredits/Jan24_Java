package shraddha;

class CharFrequency{
	void printCharFrequency(String str){
		String str1 = str.toLowerCase();
		int lastCount=0;
		char ch1=' ';
		for (int i=0;i<str1.length();i++){
			char ch = str1.charAt(i);
			int count=1;
			for(int input=0;input<str1.length();input++){
				if(i!=input){
					if(ch == str1.charAt(input)){
						count=count+1;
					}
				}
			}
			if(count>lastCount){
				lastCount=count;
				ch1=ch;
			}		
		}
		if(lastCount!=1)
		System.out.println(str+"-> "+ch1+"->"+lastCount);
			else
				System.out.println("maulik having all unique characters");
	}

		public static void main(String[] args){
			CharFrequency unique = new CharFrequency();
			unique.printCharFrequency("aakanksha");
			unique.printCharFrequency("teecccchnoceredites");
			unique.printCharFrequency("maulik");
			}
}