package hiral_purohit;

public class StringEx {

	void frquencyData(String name) {
		for (int index = name.length() - 1; index >= 0; index--) {
			System.out.println(name.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringEx stringEx = new StringEx();
		stringEx.frquencyData("techno");
	}
}
