package technocredits.arrayExamples;

public class ArrayLoop1 {
	
	void processData(String[] arr) {
		for(String name : arr) {
			char lastChar = name.charAt(name.length()-1);
			if(name.length() > 5 && (lastChar == 'a' || lastChar == 'A')) {
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Pooja", "Svee2ta", "Samiksha", "G4arima", "Anand", "Shridhar"};
		new ArrayLoop1().processData(names);
	}
}
