package pramod;

public class FrequencyOfGivenCharacterAssignment17 {
	
	void frequencyOfGivenCharacterNumber(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='t')
			{
				count++;
			}
		}
		System.out.println("frequency of t in technocredits is="+count);
	}
	
	
	public static void main(String args[])
	{
		FrequencyOfGivenCharacterAssignment17 frequencyOfGivenCharacter = new FrequencyOfGivenCharacterAssignment17();
		frequencyOfGivenCharacter.frequencyOfGivenCharacterNumber("technocredits");
	}

}
