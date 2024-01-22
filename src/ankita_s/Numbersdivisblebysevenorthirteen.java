package ankita_s;

public class Numbersdivisblebysevenorthirteen {

	void printNumbersdivisblebysevenaorthirteen(int firstindex, int endindex) {
		for (int num = endindex; num >= firstindex; num--) {
			if (num % 7 == 0)
				System.out.println(num + " is divisible by 7");
			else if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
		}
	}

	public static void main(String[] args) {
		Numbersdivisblebysevenorthirteen numbersdivisblebysevenorthirteen = new Numbersdivisblebysevenorthirteen();
		numbersdivisblebysevenorthirteen.printNumbersdivisblebysevenaorthirteen(5, 40);
	}
}
