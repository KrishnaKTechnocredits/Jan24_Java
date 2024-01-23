package sasmita;

public class LastNumberDivisiable {

	void lastDivisiable() {
		int lastnumber=0;
		for(int index=5; index<=100; index++) {
			if(index%5 == 0 && index%9 == 0) {
				lastnumber = index;
			}
		}
		System.out.println("Last number divisible by 5 & 9 is 90 " + lastnumber);
	}
	public static void main(String[]args){
		LastNumberDivisiable lastnum = new LastNumberDivisiable();
		lastnum.lastDivisiable();
	}
}
	
