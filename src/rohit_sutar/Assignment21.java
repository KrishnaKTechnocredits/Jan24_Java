package rohit_sutar;

public class Assignment21 {

	int count;
	
	void printNumber() {
		int currentNum = 1;
		int currentSum = 0;
		//While loop to check sum is less than 150
		while(currentSum <= 150){
			//if condition to check numbers which are divisible by 6
			if(currentNum % 6 == 0){
				currentSum = currentNum + currentSum;
				System.out.println("This is number divisible by 6: "+currentNum);
				count++;
			}		
			currentNum++;
		}
		System.out.println(currentNum);
		System.out.println("Addition of all numbers which are divisible by 6: "+currentSum);
		System.out.println("Minimum Numbers Require to create sum 50 are: "+count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment21 assignment21 = new Assignment21();
		assignment21.printNumber();
	}

}
