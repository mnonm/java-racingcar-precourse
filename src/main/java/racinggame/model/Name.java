package racinggame.model;

public class Name {
	private static final int MAX_LENGTH = 5;

	private final String value;

	private Name(String value) {
		this.value = value;
	}

	public static Name from(String value) {
		return new Name(value);
	}

	public static boolean isValid(String value) {
		return value.length() <= MAX_LENGTH;
	}

	public String getValue() {
		return value;
	}
}
