package akshada_marne;

class NumbersComparison{
	
	void greater(int num1, int num2){
		if(num1<num2){
			System.out.println(num2+" is bigger than "+num1);
		}
		else{
			System.out.println(num1+" is bigger than "+num2);
		}
	}
		
	void smaller(int num1, int num2){
		if(num1>num2){
			System.out.println(num2+" is smaller");
		}
		else{
			System.out.println(num1+" is smaller than "+num2);
		}
	}	
		
	public static void main (String args[]){
		NumbersComparison numbersComparison = new NumbersComparison();
		numbersComparison.greater(10,17);
		numbersComparison.smaller(10,17);
	
	}
}