package suresh.array;

public class RetunMaxAndMin {

	int getMAxAndMinNumb(int[] index)
	{
		int max=0;
		for(int i=0;i<index.length;i++)
		{
			if((index[i] >max))
			{
				max=index[i];
			}
		
	}System.out.println("maximun number is  "+max);
		return max;
	}
	
	void getMinMUmber( int[] index,int max)
	{
		int min=max;
		for(int i=0;i<index.length;i++) {
			
		if(min>index[i])
		{
			min=index[i];
		}
		}System.out.println("minimun number is  "+min);
		//
	}
	
	public static void main(String[]args)
	{
		int[] arry= {10,20,50,60,30};
		RetunMaxAndMin retunMaxAndMin = new RetunMaxAndMin();
		int max=retunMaxAndMin.getMAxAndMinNumb(arry);
		retunMaxAndMin.getMinMUmber(arry,max);
	}
	
}

