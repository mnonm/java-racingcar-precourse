package racinggame.model;

public class Name {
	private static final int MAX_LENGTH = 5;

	private final String value;

	private Name(String value) {
		this.value = value;
	}

	public static Name from(String value) {
		if (!isValid(value)) {
			throw new IllegalArgumentException("자동차 이름의 길이는 5자 이하만 가능합니다.");
		}
		return new Name(value);
	}

	public static boolean isValid(String value) {
		return value.length() <= MAX_LENGTH;
	}

	public String getValue() {
		return value;
	}
}
