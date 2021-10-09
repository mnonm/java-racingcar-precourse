package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	private List<Car> values;

	private Cars(List<Car> values) {
		this.values = values;
	}

	public static Cars from(String names) {
		String[] nameArray = names.split(",");

		List<Car> cars = new ArrayList<>();
		for (String name : nameArray) {
			cars.add(Car.create(name));
		}
		return new Cars(cars);
	}

	private static boolean isNamesValid(String[] nameArray) {
		boolean isAllValid = true;
		for (String name : nameArray) {
			isAllValid = isAllValid && Name.isValid(name);
		}
		return isAllValid;
	}

	public List<Car> getValues() {
		return values;
	}
}