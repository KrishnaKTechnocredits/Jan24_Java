package nikita_patil;

public class Assignment12 {
	
	void printall(int startRange, int endRange)
	{
		System.out.println("numbers which are divisible by 7 and 13 are : ");
		for(int num = startRange;num >= endRange;num--) {
			if(num%7==0) {
				System.out.println(num + " is divisible by 7");
			}if(num%3==0) {
				System.out.println(num + " is divisible by 13");
				
			}
		}
	}
	public static void main(String[] args) {
		Assignment12 a = new Assignment12();
		a.printall(40,5);
	}
}
