package gaurav_garg;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxValuePredifenedArrayAssignment80 {

	void minAndMaxInArray(int abc[])
	{
		int max =0;
		int min =abc[0];
		for(int i=0;i<abc.length;i++)
		{
			if(max<=abc[i])
			{
				max=abc[i];
			}
			
			if(min>=abc[i])
			{
				min =abc[i];
			}
		}
		System.out.println("From Array " + Arrays.toString(abc)+ " , maximum number is " + max +" and minimun number is " + min);
	
	}
	public static void main(String[] args) {
		int abc[] = new int[5];
		System.out.println("Enter total number");
		Scanner sc= new Scanner(System.in);
		int count=sc.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.print("Enter num : ");	
			abc[i]=sc.nextInt();
		}
		new MinAndMaxValuePredifenedArrayAssignment80().minAndMaxInArray(abc);
		
	}
}
