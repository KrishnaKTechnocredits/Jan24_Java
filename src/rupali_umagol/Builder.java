package rupali_umagol;

public class Builder {

	private static Builder builder=new Builder();
	
	private Builder() {
		
	}
	
	static Builder getObject() {
		return builder;
	}
}
