package apurva_arole;

public class Assignment22{
	void printstring(String s){
		int count=0;
		for(int i=0;i<s.length();i++) {
			boolean flag= Character.isDigit(s.charAt(i));
			if(flag==true) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.printstring("lhuy689gr580kl");
	}
}