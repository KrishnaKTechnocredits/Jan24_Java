package apurva_arole;

public class Assignment16{

	void printnum(int startindex, int Endeindex) {
		int sum = 0, count = 0;
		System.out.println("Numbers are: \n");
		for (int i = startindex; i <= Endeindex; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i + "\n");
				count++;
				sum = sum + i;
			}
		}
		System.out.println("Found " + count + " numbers which are divisible by 5 and 7 \n");
		System.out.println("Sum = " + sum);
		System.out.println("\nAverage = " + (sum / count));
   }
   public static void main(String[] args) {
	    Assignment16 assignment16 = new Assignment16();
	    assignment16.printnum(1,110); 
   }
}
