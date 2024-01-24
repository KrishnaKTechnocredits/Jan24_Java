package rohini_deshmane;

public class FrequencyOfCharWithCasesentive {
	
	void printFrequencyOfchar(String givenString, char charcter) {
		int count=0;
		givenString = givenString.toLowerCase();
		for(int i=0; i< givenString.length(); i++) {
			if(givenString.charAt(i) == charcter) {
				count ++;
			}
		}
		System.out.println("Frequency of "+charcter +" in "+charcter+" is "+count);
	}
	
	public static void main(String[] args) {
		FrequencyOfCharWithCasesentive frequencyOfCharWithCasesentive = new FrequencyOfCharWithCasesentive();
		frequencyOfCharWithCasesentive.printFrequencyOfchar("TechNoCredits Teaching", 't');
		frequencyOfCharWithCasesentive.printFrequencyOfchar("Weekly Wroking", 'w');
	}

}
