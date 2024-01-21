package apurva_arole;

public class Assignment11{
	int Index;
	  void printNum(int startIndex, int EndIndex){
		  for(Index=startIndex;Index<=EndIndex;Index++){
		    if(Index%5==0 && Index%3==0){
			 System.out.println("Divisible by 5 & 6=" + Index);
	  }
   }
}
      public static void main(String[]args){
	         Assignment11 assignment11= new Assignment11();
	         assignment11.printNum(5,40);
      }
}