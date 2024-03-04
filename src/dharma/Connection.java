package dharma;

public class Connection {

		private static Connection con = null;
		
		static Connection getobject() {
			if(con == null)
				con = new Connection();
			return con;
		}
}
