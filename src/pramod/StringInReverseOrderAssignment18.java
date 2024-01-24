package pramod;

public class StringInReverseOrderAssignment18 {

	
	void stringInReverseOrderNumber(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println("output reverse== "+s.charAt(i));
		}
	}
	public static void main(String args[])
	{
		StringInReverseOrderAssignment18 stringInReverseOrder = new StringInReverseOrderAssignment18();
		stringInReverseOrder.stringInReverseOrderNumber("techno");
	}

}

