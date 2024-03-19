package shraddha;

import java.util.Scanner;

public class Assignment_80 {
	
	public static void main(String[] args) {
		int[] abc = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter number in position" + i);
			int input = sc.nextInt();
			abc[i] = input;
		}
		sc.close();
		int max = calculateMax(abc);
		System.out.println("Max Number in given array is "+max);
		int min = calculateMin(abc);
		System.out.println("Min Number in given array is "+min);
		
	}
	public static int calculateMax(int[] numArray)
	{
		int max=0;
		for(int i=0; i< numArray.length;i++)
		{
			if(numArray[i]>max)
				max=numArray[i];
		}
		return max;
	}
	
	public static int calculateMin(int[] numArray)
	{
		int min=0;
		for(int i=0; i< numArray.length;i++)
		{
			if(i==0)
				min=numArray[i];
			if(numArray[i]<min)
				min=numArray[i];
		}
		return min;
	}

}
