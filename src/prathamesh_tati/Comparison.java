package prathamesh_tati;

// Assignment 7

class Comparison{

	int num1 = 10;
	int num2 = 17;
	
	void numbersComparison(){
		if(num1 < num2){
			System.out.println(num1 + " is smaller between " + num1 + " and "+ num2 + ".");
		}else{
			System.out.println(num2 + " is smaller between " + num1 + " and "+ num2 + ".");

		}
	}
	
	public static void main(String[] args){
		
		Comparison comparison = new Comparison();
		comparison.numbersComparison();		
	}
}