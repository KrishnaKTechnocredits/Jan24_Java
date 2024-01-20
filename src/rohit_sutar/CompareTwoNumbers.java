package rohit_sutar;

class CompareTwoNumbers{
	
	void maxNumber(int num1, int num2){
		if(num1 > num2){
			System.out.println(num1 +" is bigger than " +num2);
		}
		else
			System.out.println(num2 +" is bigger than " +num1);
	}
	
	void minNumber(int num1, int num2){
		if(num1 < num2){
			System.out.println(num1 +" is smaller than " +num2);
		}
		else
			System.out.println(num2 +" is smaller than " +num1);
	}
	
	public static void main(String args[]){
		CompareTwoNumbers compareTwoNumbers = new CompareTwoNumbers();
		compareTwoNumbers.maxNumber(10, 17);
		compareTwoNumbers.minNumber(10, 17);
	}
}