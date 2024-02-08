package gaurav_garg;

public class FrequencyOfCountTwoAssignment19 {

	int count=0;
	void countletterstring(String abc, char characterr)
	{
		String a =abc.toLowerCase();
		
		for(int i=0;i<a.length();i++)
		{
			char n=a.charAt(i);
			if(characterr == n)				
			{
				count++;
			}
		}
		System.out.println("frequency of " +characterr + " in technocredits is "+ count);
		
	}
	public static void main(String[] args) {
		FrequencyOfCountTwoAssignment19 frequencyofcounttwoassignment19 =new FrequencyOfCountTwoAssignment19();
		frequencyofcounttwoassignment19.countletterstring("technocrediTs teaches Technology",'t');
	}
}
