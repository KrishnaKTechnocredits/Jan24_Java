/*Assignment - 62 : 16th Feb'2024
"Print sum of numbers and Handle decimal numbers too:
input: te3ch4.5noc7red8.1its
output: 22.6
hint: 3 + 4.5 + 7 + 8.1"*/
package sveta;

public class Assignment_62 {

	public double printString(String str) {
		double sum=0;
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			String current ="";
			if(Character.isDigit(ch)) {
				current+=ch;
				if(str.charAt(i+1) == '.') {
					current +=".";
					i++;
					if(Character.isDigit(str.charAt(i+1))) {
						current+=str.charAt(i+1);
						i++;
					}
				}
				sum+=Double.parseDouble(current);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Assignment_62 ass = new Assignment_62();
		double sum =ass.printString("te3ch4.5noc7red8.1its");
		System.out.println(sum);
	}

}
