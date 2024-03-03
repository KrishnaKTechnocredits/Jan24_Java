package ankita_s;

public class EagerLoadingClient {

	public static void main(String[] args) {
		EagerLoadingConnection con1 = EagerLoadingConnection.getobject();
		EagerLoadingConnection con2 = EagerLoadingConnection.getobject();
		EagerLoadingConnection con3 = EagerLoadingConnection.getobject();
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}
}
