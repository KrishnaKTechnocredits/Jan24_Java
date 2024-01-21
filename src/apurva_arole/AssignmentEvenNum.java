package apurva_arole;

public class AssignmentEvenNum{
	
    void PrintNum(int StartIndex, int EndIndex){
     for(int Index=StartIndex;Index<=EndIndex;Index++){
    	 if(Index%2==0)
    		System.out.println("Even number is=" +Index);
             }
    }   	   
    public static void main(String[]args){
        	AssignmentEvenNum assignmentEvenNum= new AssignmentEvenNum();
        	assignmentEvenNum.PrintNum(10,15);
    } 
}
