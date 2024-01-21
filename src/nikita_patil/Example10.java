package nikita_patil;

class Example10 {
	int age = 1;
	String name = "Nikita";

	void setData(int age, String name) {

		this.age = age;
		this.name = name;
	}

	void updateData(String name) {
		this.name = name;
	}

	void display() {
		System.out.println(age + "-------> " + name);
	}

	public static void main(String[] args) {
		Example10 e1 = new Example10();
		e1.setData(19, "Anki");
		e1.display();

		Example10 e2 = new Example10();
		e2.updateData("Niki");
		e2.display();
	}
}