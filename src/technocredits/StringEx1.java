package technocredits;

class StringEx1 {

	void processData(String str) {
		int index = str.indexOf('h');
		System.out.println(index);
		
		int lastIndex = str.lastIndexOf('h');
		System.out.println(lastIndex);
	}

	public static void main(String[] args) {
		new StringEx1().processData("techeneoecredits");
	}
}