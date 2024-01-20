package prathamesh_tati;

class EvenOdd{

	void condition(int num){
		if(num%2==0){
			System.out.println(+ num + " is Even number");
		}else{
			System.out.println(+ num + " is odd number");
		}
	}
	
	public static void main(String[] args){
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.condition(25);
		evenOdd.condition(32);
	}
}