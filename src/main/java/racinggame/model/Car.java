package racinggame.model;

public class Car {
	private final Name name;
	private final Position position;

	private Car(Name name) {
		this.name = name;
		this.position = Position.init();
	}

	public static Car create(String carName) {
		Name name = Name.from(carName);
		return new Car(name);
	}

	public Name getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}
}
