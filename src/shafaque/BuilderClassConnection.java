package shafaque;

	public class BuilderClassConnection {
		
		private static BuilderClassConnection con = new BuilderClassConnection();
		private BuilderClassConnection() {
			
		}

		static BuilderClassConnection getobject()
		{
			return con;
		}
	}


