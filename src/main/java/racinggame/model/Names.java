package racinggame.model;

import java.util.ArrayList;
import java.util.List;

public class Names {
	private List<Name> values;

	private Names(List<Name> values) {
		this.values = values;
	}

	public static Names of(Cars cars) {
		List<Name> names = new ArrayList<>();
		for (Car car : cars.getValues()) {
			names.add(car.getName());
		}
		return new Names(names);
	}

	public static Names of(String inputNames) {
		List<Name> names = new ArrayList<>();
		String[] nameArray = inputNames.split(",");
		for (String name : nameArray) {
			names.add(Name.from(name));
		}

		return new Names(names);
	}

	public List<String> getNameValues() {
		List<String> nameValues = new ArrayList<>();
		for (Name name : values) {
			nameValues.add(name.getValue());
		}
		return nameValues;
	}

	public List<Name> getValues() {
		return values;
	}
}
