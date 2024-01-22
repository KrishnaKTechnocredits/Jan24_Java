package aanand;

public class CountOfEvenOdd{

	public static void main(String[] args){
		
		int num = 13579;
		int Evencount = 0;
		int Oddcount = 0;
		
		while(num >0){
			int rem = num % 10;
			if(rem % 2 ==0){
				
				Evencount++;
			
			} else {
				Oddcount++;
			}
			num = num /10;
		}
		System.out.println("Even number count is " +Evencount);
		System.out.println("Even number count is " +Oddcount);
	}
}