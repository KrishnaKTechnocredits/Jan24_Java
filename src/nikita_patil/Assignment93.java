package nikita_patil;

public class Assignment93 {

	void swappingOgInteger(int a, int b) {
		System.out.println("Value of a is:" + a);
		System.out.println("Value of b is:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value after swapping");
		System.out.println("Value of a is:" + a);
		System.out.println("Value of b is:" + b);
	}

	void swappingOfString(String str1, String str2) {
		System.out.println("Value of str1 is:" + str1);
		System.out.println("Value of str2 is:" + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Value after swapping");
		System.out.println("Value of str1 is: " + str1);
		System.out.println("Value of str2 is: " + str2);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment93 a= new Assignment93();
		a.swappingOgInteger(5, 8);
		System.out.println("...............................");
		a.swappingOfString("Hello", "World");
	}
}


