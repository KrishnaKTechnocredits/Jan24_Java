package gaurav_garg;

public class PrintEvenNumberAssignment9 {
void evennumber(int numb1, int numb2)
{
	for (int i=numb1;i<=numb2;i++)
	{
		if(i%2==0) {
			System.out.println(i);
		}
	}
}
 public static void main(String...s)
{
    PrintEvenNumberAssignment9 printevennumberassignment9 = new PrintEvenNumberAssignment9();
    printevennumberassignment9.evennumber(10,15);
}
}
