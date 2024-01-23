/*Assignment - 17 : 23th Jan'2024
1. Print the frequency of the given character from the given String.*/


package shraddha;

class Techno{
	void print(String input, char targetchar){
		int count = 0;
		for (int index=0; index < input.length(); index++){
				char ch = input.charAt(index);
			if(ch == targetchar)
				count++;	
		}
	System.out.println("frequency of 't' in technocredits is: "+ count);
	}
	public static void main(String[] args){
		Techno techno = new Techno();
		techno.print("technocredits",'t');
	}
}