package hiral_purohit;
//eager loading implementation
public class Client {

	public static void main(String[] args) {
		Builder builder = Builder.getObject();
		Builder builder2 = Builder.getObject();
		Builder builder3 = Builder.getObject();
		System.out.println(builder);
		System.out.println(builder2);
		System.out.println(builder3);
	}

}
