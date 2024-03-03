package hiral_purohit;

public class Client { // extends Connection

	public static void main(String[] args) {
		Connection con = Connection.getObject();
		Connection con2 = Connection.getObject();
		Connection con3 = Connection.getObject();
		System.out.println(con);
		System.out.println(con2);
		System.out.println(con3);
	}

}
