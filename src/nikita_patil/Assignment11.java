package nikita_patil;

public class Assignment11 {
	int num;
	void Divisible(int startIndex, int endIndex) 
	  {
		System.out.println("Divisible by 5 & 3 , numbers are : ");
		for(int index=1; index<=40;index=index+1)
		{
			if(index%3 ==0 && index%5==0)
			{
				System.out.println(index);
				
			}
			
		}
	}
	public static void main(String[] args) {
		Assignment11 a  = new Assignment11();
		a.Divisible(5,40);	
	}

}
