package rupali_umagol;

public class Client {

	public static void main(String[] args) {

		Connection c1 = Connection.getObject();
		Connection c2 = Connection.getObject();
		Connection c3 = Connection.getObject();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
