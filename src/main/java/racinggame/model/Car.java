package racinggame.model;

public class Car {
	private static final int MOVE_CONDITION = 4;

	private final Name name;
	private final Position position;

	private Car(Name name) {
		this.name = name;
		this.position = Position.init();
	}

	public static Car create(Name carName) {
		return new Car(carName);
	}

	public void start(int value) {
		if (value < MOVE_CONDITION) {
			return;
		}

		moveForward();
	}

	private void moveForward() {
		position.forward();
	}

	public Name getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}

	public boolean isSamePosition(Position maxPosition) {
		return position.equals(maxPosition);
	}
}
