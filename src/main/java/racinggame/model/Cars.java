package racinggame.model;

import static java.util.Comparator.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nextstep.utils.Randoms;

public class Cars {
	private List<Car> values;

	private Cars(List<Car> values) {
		this.values = values;
	}

	public static Cars from(List<Car> cars) {
		return new Cars(cars);
	}

	public static Cars from(String names) {
		String[] nameArray = names.split(",");

		List<Car> cars = new ArrayList<>();
		for (String name : nameArray) {
			cars.add(Car.create(name));
		}
		return new Cars(cars);
	}

	public static boolean isValidNames(String inputNames) {
		String[] nameArray = inputNames.split(",");
		boolean isAllValid = true;
		for (String name : nameArray) {
			isAllValid = isAllValid && Name.isValid(name);
		}
		return isAllValid;
	}

	public List<Car> getValues() {
		return values;
	}

	public Position getMaxPosition() {
		Car maxPositionCar = Collections.max(values, comparing(Car::getPosition));
		return maxPositionCar.getPosition();
	}

	public Cars getCarsEqualPosition(Position maxPosition) {
		List<Car> winnerCars = new ArrayList<>();
		for (Car car : values) {
			addCarIfMaxPosition(winnerCars, car, maxPosition);
		}
		return Cars.from(winnerCars);
	}

	private void addCarIfMaxPosition(List<Car> winnerCars, Car car, Position maxPosition) {
		if (car.isSamePosition(maxPosition)) {
			winnerCars.add(car);
		}
	}

	public void start() {
		for (Car car : values) {
			car.start(Randoms.pickNumberInRange(0, 9));
		}
	}
}