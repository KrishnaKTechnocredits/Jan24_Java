package sasmita;

public class DivisiablebyFivaandThree{
	
	void printDivisiableNumbers() {
		for(int index=5;index<=40;index++){
			if(index%3 == 0 && index%5==0) {
				System.out.println(index);	
			}
		}
	}
	public static void main(String[]args) {
		DivisiablebyFivaandThree divisiable = new DivisiablebyFivaandThree();
		divisiable.printDivisiableNumbers();
	}

}
