package racinggame.model;

public class Car {
	private final Name name;

	private Car(Name name) {
		this.name = name;
	}

	public static Car create(String carName) {
		Name name = Name.from(carName);
		return new Car(name);
	}

	public Name getName() {
		return name;
	}
}
