package apurva_arole;

public class AssignmentEvenNum{
	int Index;
	
    void PrintNum(int StartIndex, int EndIndex)
    {
     for(int Index=StartIndex;Index<=EndIndex;Index++){
    	if(Index%2==0)
    		System.out.println("Even number is=" +Index);
    	    Index = Index+1;                                         }
    }   	
    public static void main(String[]args){
        	AssignmentEvenNum assignmentEvenNum= new AssignmentEvenNum();
        	assignmentEvenNum.PrintNum(10,15);
    } 
}
