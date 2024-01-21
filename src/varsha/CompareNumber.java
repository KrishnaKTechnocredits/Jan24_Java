package varsha;

class CompareNumber{
	
	void maximumNumber(int num1, int num2){
		if(num2 > num1)
			System.out.println(num2 + " is bigger between " + num1 + " and " + num2);
		else 
			System.out.println(num1 + " is bigger between " + num1 + " and " + num2);
	}

	void minimumNumber(int num1, int num2){
		if(num1 < num2)
			System.out.println(num1 + " is smaller between " + num1 + " and " + num2);
		else
			System.out.println(num2 + " is smaller between " + num1 + " and " + num2);
	}

	public static void main(String[] args){
		CompareNumber compareNumber = new CompareNumber();
		compareNumber.maximumNumber(10,17);
		compareNumber.minimumNumber(10,17);
		compareNumber.maximumNumber(29,14);
		compareNumber.minimumNumber(29,14);
	}
}