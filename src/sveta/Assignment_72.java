package sveta;

public class Assignment_72 {

	public int getMaxLength(String arr[])
	{
		int max =0;
		for(int i=0;i<arr.length;i++) {
			int no=arr[i].length();
			if(no>max) 
				max=no;
		}
		return max;
	}
	
	public String getNewString(String str, int maxLen) {
		String str1="";
		int s1=0;
		String s2="";
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			//System.out.println(ch);
			if(!Character.isDigit(ch)) {
				s2=s2+ch;	
			}
		}
		int no = maxLen-s2.length();
		for(int i=0;i<=no;i++) {
			str1+=" ";
		}
		str1+=s2;
		return str1;
	}
	
	public void printString(String strarr[]) {
		int maxlen=getMaxLength(strarr);
		for(int i=0;i<strarr.length;i++) {
			String outputStr=getNewString(strarr[i],maxlen);
			System.out.println(outputStr);
		}
	}
	
	public static void main(String[] args) {
		String str = "H5el6lo Hi Tech3noc2redits pu1ne";
		String strarr[] = str.split(" ");
		new Assignment_72().printString(strarr);
	}

}
