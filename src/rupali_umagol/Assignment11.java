package rupali_umagol;

	public class Assignment11{
	void divisible(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++) {
			if(num%3==0 && num%5==0)
				System.out.println(num);
		}
	}
	 public static void main(String[] args)
	 {
		Assignment11 assignment11=new Assignment11();
		System.out.println("Divisible by 5 & 3, numbers are :");
		assignment11.divisible(5, 40);
	 }
}
