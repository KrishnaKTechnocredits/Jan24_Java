package ankita_s;

public class Numbersdivisblebyfiveandthree {
	
	void printNumbersdivisblebyfiveandthree(int startindex, int endindex) {
		for (int num = startindex; num <= endindex; num++) {
			if (num % 5 == 0 && num % 3 == 0)
				System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Numbersdivisblebyfiveandthree numbersdivisblebyfiveandthree = new Numbersdivisblebyfiveandthree();
		System.out.println("Below are the numbers which are divisble by five and three:-");
		numbersdivisblebyfiveandthree.printNumbersdivisblebyfiveandthree(5, 40);
	}
}