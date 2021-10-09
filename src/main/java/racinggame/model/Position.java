package racinggame.model;

import java.util.Objects;

public class Position implements Comparable<Position> {
	public static final int START_POSITION = 0;

	private Integer value;

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

	@Override
	public int compareTo(Position o) {
		return this.value.compareTo(o.getValue());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Position position = (Position)o;
		return Objects.equals(value, position.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
