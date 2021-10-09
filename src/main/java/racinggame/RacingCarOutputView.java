package racinggame;

import racinggame.model.Car;
import racinggame.model.Cars;
import racinggame.model.Name;
import racinggame.model.Names;
import racinggame.model.Position;
import racinggame.model.Winner;

public class RacingCarOutputView {
	public void printResult(Cars cars) {
		for (Car car : cars.getValues()) {
			printName(car.getName());
			printPosition(car.getPosition());
			nextLine();
		}
		nextLine();
	}

	public void printWinner(Winner winner) {
		Names winnerNames = Names.of(winner.getCars());
		System.out.printf("최종 우승자는 %s 입니다.", String.join(",", winnerNames.getNameValues()));
	}

	private void printPosition(Position position) {
		for (int i = 0; i < position.getValue(); i++) {
			System.out.print("-");
		}
	}

	private void printName(Name name) {
		System.out.print(name.getValue() + " : ");
	}

	public void printResultStart() {
		nextLine();
		System.out.println("실행결과");
	}

	private void nextLine() {
		System.out.println();
	}
}
