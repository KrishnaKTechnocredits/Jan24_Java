package shramika_vaidya;

public class Builder {

	private static Builder obj;

	static {
		obj = new Builder();
	}

	private Builder() {

	}

	static Builder getObject() {
		return obj;
	}
}
