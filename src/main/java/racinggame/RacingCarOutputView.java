package racinggame;

import racinggame.model.Car;
import racinggame.model.Cars;
import racinggame.model.Name;
import racinggame.model.Position;

public class RacingCarOutputView {
	public void printResult(Cars cars) {
		printResultStart();
		for (Car car : cars.getValues()) {
			printName(car.getName());
			printPosition(car.getPosition());
			nextLine();
		}
	}

	private void printPosition(Position position) {
		for (int i = 0; i < position.getValue(); i++) {
			System.out.print("-");
		}
	}

	private void printName(Name name) {
		System.out.print(name.getValue() + " : ");
	}

	private void printResultStart() {
		nextLine();
		System.out.println("실행결과");
	}

	private void nextLine() {
		System.out.println();
	}
}
