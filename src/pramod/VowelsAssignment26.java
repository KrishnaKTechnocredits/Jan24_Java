package pramod;


public class VowelsAssignment26 {

	void removeVowels(String str)
	{
		for(int index=0;index<str.length();index++)
		{
			char ch=str.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				str=str.replaceAll(String.valueOf(ch), "*");		
			}
		}
		str=str.replace("*","");
		System.out.println(str);
	}
		
	public static void main(String[] args) {
		VowelsAssignment26 vowelsAssignment26 = new VowelsAssignment26();
		vowelsAssignment26.removeVowels("technocredits");
	}
}
