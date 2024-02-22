package shravani_rapelli;

public class Assignment67_2 {
	
		String stringToLower(String input) {
			String str="";
			for(int i=0; i<input.length(); i++) {
				str = input.toLowerCase();
				str = str + " ";
			}
			return str;
		}
		
		void firstLetterCapitailize(String[] arr) {
			String result="";
			char ch=' ';
			String str2 = "";
			for(int i=0; i<arr.length; i++) {
				String str1 = stringToLower(arr[i]);
				ch = Character.toUpperCase(str1.charAt(0));
				str2 = str1.replace(str1.charAt(0), ch);
				result+=str2;
			}
			System.out.println(result);
		}
		
		public static void main(String[] args) {
			Assignment67_2 assg67_2 = new Assignment67_2();
			String input = "hi hEllO how are you";
			String[] arr = input.split(" ");
			assg67_2.firstLetterCapitailize(arr);
		}

}
