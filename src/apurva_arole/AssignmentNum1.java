package apurva_arole;

public class AssignmentNum1{
	int Index;
	  void printNum(int startIndex, int EndIndex){
		  for(int Index=startIndex;Index<=EndIndex;Index++){
		    if(Index%5==0 && Index%3==0){
			 System.out.println(Index);
	       }
	   }
  }
      public static void main(String[]args){
	         AssignmentNum1 assignmentnum1= new AssignmentNum1();
	         assignmentnum1.printNum(5,40);
      }
}