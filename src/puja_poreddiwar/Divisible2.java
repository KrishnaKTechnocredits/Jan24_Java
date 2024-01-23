package puja_poreddiwar;

public class Divisible2 {

	void divisibleof7and13(int startRange, int endRange) 
	{
		System.out.println("numbers which are divisible by 7 or 13 are: ");
		for(int num = startRange; num >= endRange; num--) {
			if(num%7 == 0) {
				System.out.println(num + " - is divisible by 7");
			}if(num%13 == 0) {
				System.out.println(num + " - is divisible by 13");
			}
		}
	}
	public static void main(String[] args) {
		Divisible2 divisible2 = new Divisible2();
		divisible2.divisibleof7and13(40,5);
	}

}
