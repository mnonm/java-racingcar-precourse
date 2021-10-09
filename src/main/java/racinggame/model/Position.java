package racinggame.model;

public class Position {
	public static final int START_POSITION = 0;

	private int value;

	private Position(int value) {
		this.value = value;
	}

	public static Position init() {
		return new Position(START_POSITION);
	}

	public int getValue() {
		return value;
	}

	public void forward() {
		this.value++;
	}
}
