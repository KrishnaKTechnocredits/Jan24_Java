package shafaque;

public class CharFrequency {
	
	int count=0;
	
	void checkcharfreq(String input, char targetchar)
	{
		for(int index =0; index < input.length(); index++)
		{
			char ch = input.charAt(index);
			if(ch == targetchar) {
				count++;
			}
		}
		System.out.println("Frequency of t in technocredits is  " +count);
	}
public static void main(String[] args)
{
	CharFrequency charFrequency = new CharFrequency();
	charFrequency.checkcharfreq("technocredits" , 't');
}
}
