package ashwini_b;

/*
Assignment - 45 : 4th Feb'2024---
Print all the names from given array if Uppercase characters are more than lowercase characters.
input : {"aAShVI", "TEchNoCRediTs", "ANSh","dhARMma","vIDhItA"}		 
Output : aAShVI
		 ANSh
		 vIDhItA
 */
public class ArrayNameUppAndLowCase {

	void printName(String[] names) {
		for(int index = 0 ; index < names.length ; index++) {
			String name = names[index];
			//System.out.println(name);
			int upcasecount = 0;
			int lowcasecount = 0;
			for(int j=0 ; j< name.length();j++ ) {
				char ch = name.charAt(j);
				
				if(Character.isUpperCase(ch)) {
					//System.out.println(ch);
					upcasecount++;
				}
				if(Character.isLowerCase(ch)) {
					//System.out.println(ch);
					lowcasecount++;
				}
				
			}
			if(upcasecount > lowcasecount ) {
				System.out.println(name);
			}
			}
			
		}

	public static void main(String[] args) {
		String[] inputArry = { "aAShVI", "TEchNoCRediTs", "ANSh", "dhARMma", "vIDhItA" };
		ArrayNameUppAndLowCase arrayNameUppAndLowCase = new ArrayNameUppAndLowCase();
		arrayNameUppAndLowCase.printName(inputArry);

	}

}
