package technocredits.collectionsframework.mapdemo;

public class Example9 {
	
	public static void main(String[] args) {
		String input = "Maulik__Krishna____Aashvi_";
		
		String word = "";
		String deliminator = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch == '_') {
				deliminator += ch;
			}else{
				if(deliminator.length()==0)
					word = word + ch;
				else {
					System.out.println(word + "->" + deliminator.length());
					word = "";
					deliminator = "";
				}
			}
		}
		if(deliminator.length()>0 || word.length()>0) {
			System.out.println(word + "->" + deliminator.length());
		}
	}
}
