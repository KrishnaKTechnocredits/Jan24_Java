package technocredits.interview;
public class Assignment_72 {
	static int sum = 0;
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
		String output = "";
		for(int count=1;count<=maxLen-str.length();count++) {
			output = output + " ";
		}
		output = output + str;
		return output;
	}
	
	public void printString(String strarr[]) {
		int maxlen=getMaxLength(strarr);
		for(int i=0;i<strarr.length;i++) {
			String outputStr=getNewString(strarr[i],maxlen);
			System.out.println(outputStr);
		}
		String sumString = getNewString(String.valueOf(sum),maxlen);
		System.out.println(sumString);
	}
	
	static String removeDigit(String input) {
		String temp = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(!Character.isDigit(ch)) {
				temp = temp + ch;
			}else {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		String str = "H5el6lo Hi Tech3noc2redits pu1ne";
		str = removeDigit(str);
		String strarr[] = str.split(" ");
		new Assignment_72().printString(strarr);
	}

}