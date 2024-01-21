package sasmita;

public class DivisiableBySevenandThirteen{
	
	void divisiableNumbers(){
		for(int index=5; index<=40; index++) {
			if(index%7 == 0) {
				System.out.println(index + "is divisiable by "+index);
			}else if(index%13 == 0){
				System.out.println(index + "is divisiable by "+index);
			}
		}
	}
	public static void main(String[]args){
		DivisiableBySevenandThirteen div = new DivisiableBySevenandThirteen();
		div.divisiableNumbers();
	}

}
