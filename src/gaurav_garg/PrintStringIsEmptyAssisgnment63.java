/*
 Detect empty input string:
input: """"
output: Empty string, no character found.
 */
package gaurav_garg;

public class PrintStringIsEmptyAssisgnment63 {

	void printWeatherStringEmptyOrNot(String str)
	{
	if(str.isEmpty())
		System.out.print("Empty string, no character found.");
	else
		System.out.print("Not Empty string, character found.");
	}
	
	public static void main(String[] args) {
		new PrintStringIsEmptyAssisgnment63().printWeatherStringEmptyOrNot("");
	}
}
