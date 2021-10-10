package racinggame.model;

public class TryCount {
	public static final String NUMBER_PATTERN = "^[0-9]+$";
	private int value;

	private TryCount(int value) {
		this.value = value;
	}

	public static TryCount from(String tryCountStr) {
		int value = Integer.parseInt(tryCountStr);
		return new TryCount(value);
	}

	public static boolean isValid(String input) {
		return input.matches(NUMBER_PATTERN) && isMoreThanOne(input);
	}

	private static boolean isMoreThanOne(String input) {
		return Integer.parseInt(input) > 0;
	}

	public int getValue() {
		return value;
	}
}
