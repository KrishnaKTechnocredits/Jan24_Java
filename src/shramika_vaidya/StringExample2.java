package shramika_vaidya;

class StringExample2{
	
	void printAllCharacter(String input){
		for(int index=input.length()-1;index>=0;index--){
			System.out.println(input.charAt(index));
		}
	}
	
	public static void main(String[] args){
		StringExample2 stringExample2 = new StringExample2();
		stringExample2.printAllCharacter("Techno");
	}
}