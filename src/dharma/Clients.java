package dharma;

public class Clients extends Connection {

	public static void main(String[] args) {
		Connection con1 = Clients.getobject();
		Connection con2 = Clients.getobject();
		Connection con3 = Clients.getobject();
		
		System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
	}
}
