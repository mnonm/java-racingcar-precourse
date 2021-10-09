package racinggame.model;

public class Winner {
	private Cars cars;

	private Winner(Cars cars) {
		this.cars = cars;
	}

	public static Winner from(Cars cars) {
		Position maxPosition = cars.getMaxPosition();
		Cars winnerCars = cars.getCarsEqualPosition(maxPosition);
		return new Winner(winnerCars);
	}

	public Cars getCars() {
		return cars;
	}
}
