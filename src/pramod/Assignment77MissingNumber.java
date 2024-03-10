package pramod;

import java.util.Arrays;

//Assignment - 77 : 9th March'2024
//Program 1: Find out first missing number from 1 to 10.
// 
//int[] x = {2,4,1,5,6,9,8,10};
//output : 3
//
//Program 2 : Find out last missing number from 1 to 10.
// 
//int[] x = {2,4,1,5,6,9,8,10};
//output : 7
//
//Program 3 : Find out all missing number from 1 to 10.
// 
//int[] x = {2,4,1,5,6,9,8,10};
//output : 3
//         7 
//

public class Assignment77MissingNumber {

	int firstMissing(int[] arr)
	{
		int number=0;
		for(int i=1;i<10;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				number=i;
				break;
			}
		}
		return number;
	}
	
	int lastMissing(int[] arr)
	{
		int number=0;
		for(int i=1;i<10;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				number=i;

			}
		}
		return number;
	}
	
	
	int[] allMissing(int[] arr)
	{
		int[] number=new int[2];
		int k=0;
		for(int i=1;i<10;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				number[k]=i;
				k++;

			}
		}

	
		return number;
	}
	
	
	public static void main(String[] args)
	{
		Assignment77MissingNumber assign = new Assignment77MissingNumber();
		int[] x = {2,4,1,5,6,9,8,10};
		int first =assign.firstMissing(x);
		System.out.println("First missing number= "+first);
		int last = assign.lastMissing(x);
		System.out.println("Last missing number= "+last);
		int all[]=assign.allMissing(x);
		for(int k:all)
		System.out.println("all missing number= "+k);
		
		
	}
	
}
