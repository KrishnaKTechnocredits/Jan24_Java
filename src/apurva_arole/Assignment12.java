package apurva_arole;

public class Assignment12 {
	void PrintAllNo(int startIndex, int EndIndex) {
		for(int Index=EndIndex;Index>=startIndex;Index--){
			if(Index%7==0) {
				System.out.println(Index+ "is divisible by 7");
			}else if(Index%13==0) {
				System.out.println(Index+ "is divisible by 13");
			}
		}
	}
    public static void main(String[] args){
	          Assignment12 assignment12 = new Assignment12();
	          assignment12.PrintAllNo(5,40);
   }
}
