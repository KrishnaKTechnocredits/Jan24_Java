package shraddha;

class CompareNumber{
	
	void biggerNo(int num1,int num2){
		if(num1 > num2){
			System.out.println("Num1= "+ num1);
			System.out.println("Num2= "+ num2);
			System.out.println(num1 + " is bigger no between " + num1 + " and " + num2);
		}
		else{
			System.out.println(num2 + " is bigger no between " + num1 + " and " + num2);
		}
	}
	
	void smallerNo(int num1,int num2){
		if(num1 < num2){
			System.out.println(num1 + " is smaller no between " + num1 + " and " + num2);
		}
		else{
			System.out.println(num1 + " is bigger no between " + num1 + " and " + num2);
		}
	}
	
	public static void main(String[] args){
		CompareNumber compareNumber = new CompareNumber();
		compareNumber.biggerNo(17,10);
		compareNumber.smallerNo(10,17);
	}
}