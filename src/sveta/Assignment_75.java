package sveta;

public class Assignment_75 {

	boolean isDigitCheck(String str){
		boolean flag=false;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) 
				flag= true;
		}
		return flag;
	}
	
	void processData(String[] arr) {
		for(String name:arr) {
			Boolean flag =isDigitCheck(name);
			char ch =name.charAt(name.length()-1);
			if(name.length()>5 && (ch =='a'||ch == 'A') && !flag)
				System.out.println(name);
		}
	}
	public static void main(String[] args) {
		String[] arr= {"pooja","Svee2ta","Samiksha","G4arima","Anand","Shridhar"};
		new Assignment_75().processData(arr);
	}

}
