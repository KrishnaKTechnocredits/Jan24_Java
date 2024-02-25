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
	
	public String getNewString(String str,int maxLen) {
		String str1="";
		int no=maxLen-str.length();
		for(int i=0;i<no;i++) {
			str1+=" ";
		}
		str1+=str;
		return str1;
	}
	public String removeDigit(String strarr) {
		int sum=0;
		String str="";
		for (int i=0;i<strarr.length();i++) {
			char ch =strarr.charAt(i);
			if(Character.isDigit(ch)) {
				sum+=Integer.parseInt(ch+"");
			}
			else {
				str+=ch;
			}
		}
		str=str +" "+sum;
		return str;
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
		Assignment_72 ass =new Assignment_72();
		String str1=ass.removeDigit(str);
		String strarr[] = str1.split(" ");
		ass.printString(strarr);
	}
}