package gaurav_garg;

public class PrintIntArrayReverseOrderAssigment32 {
	void printReverseArrayInt(int array1[])
	{
		for(int i=array1.length-1;i>=0;i--)
		{
			System.out.println(array1[i]);
		}
	}
public static void main(String[] args) {
	int arr[]= {10, 20, 13, 27, 29, 13, 6};
	 new PrintIntArrayReverseOrderAssigment32().printReverseArrayInt(arr);
}
}
