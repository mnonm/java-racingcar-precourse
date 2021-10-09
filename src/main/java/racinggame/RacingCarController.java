package racinggame;

import nextstep.utils.Console;
import racinggame.model.Cars;

public class RacingCarController {
	private final RacingCarView racingCarView;

	public RacingCarController(RacingCarView racingCarView) {
		this.racingCarView = racingCarView;
	}

	public void gameStart() {
		racingCarView.printStartMessage();
		String inputNames = readNameUntilValid();
		Cars car = Cars.from(inputNames);
	}

	private String readNameUntilValid() {
		String inputNames = Console.readLine();
		while(!Cars.isValidNames(inputNames)) {
			racingCarView.printErrorMessageForName();
			inputNames = Console.readLine();
		}
		return inputNames;
	}
}
