package ankita_s;

public class BuilderClient {

	public static void main(String[] args) {
		BuilderConnection con1 = BuilderConnection.getobject();
		BuilderConnection con2 = BuilderConnection.getobject();
		BuilderConnection con3 = BuilderConnection.getobject();
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}
}
