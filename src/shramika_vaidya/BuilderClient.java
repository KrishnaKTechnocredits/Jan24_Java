package shramika_vaidya;

public class BuilderClient {

	public static void main(String[] args) {
		Builder obj1 = Builder.getObject();
		Builder obj2 = Builder.getObject();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
