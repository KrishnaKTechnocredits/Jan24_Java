package suresh.array;

public class MaxNumberInArry {


	void maxNumbInArry(int[]index)
	{
		int max=0;
		//int min=0;
		for (int i=0;i<index.length;i++) {
			if(max<index[i])
				max=index[i];
			//if(min>)
		
	}System.out.println(max);
}
	public static void mian(String[] args)
	{
		int[] arry= {10,20,50,60,30};
	
		new MaxNumberInArry().maxNumbInArry(arry);
	}
}


