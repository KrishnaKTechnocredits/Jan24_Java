package rupali_umagol;

public class Assignment45 {
	int getUpperCase(String name) {
		int count1=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isUpperCase(ch)) {
				count1++;
			}
		}
		return count1;
	}
	
	int getLowerCase(String name) {
		int count2=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isLowerCase(ch)) {
				count2++;
			}
		}
		return count2;
	}
	
	void printMaxNames(String[] input) {
		for(int i=0;i<input.length;i++) {
			int upper=getUpperCase(input[i]);
			int lower=getLowerCase(input[i]);
			if(upper>lower)
			System.out.println(input[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment45 assignment45=new Assignment45();
		String[] arr={"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"};
		assignment45.printMaxNames(arr);
	}
}