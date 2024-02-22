package sveta;

public class Assignment_69 {
	
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
		int no =maxLen-str.length();
		for(int i=0;i<=no;i++) {
			str1+=" ";
		}
		str1+=str;
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
		String str = "Hello Hi Technocredits Pune";
		String arr[] =str.split(" ");
		new Assignment_69().printString(arr);
	}

}
