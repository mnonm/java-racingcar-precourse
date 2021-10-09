package racinggame;

import nextstep.utils.Console;
import racinggame.model.Cars;
import racinggame.model.TryCount;

public class RacingCarController {
	private final RacingCarView racingCarView;

	public RacingCarController(RacingCarView racingCarView) {
		this.racingCarView = racingCarView;
	}

	public void gameStart() {
		racingCarView.printStartMessage();
		String inputNames = readNameUntilValid();
		racingCarView.printRepeatCountMessage();
		TryCount tryCount = readTryCountUntilValid();
		Cars car = Cars.from(inputNames);
	}

	private TryCount readTryCountUntilValid() {
		String tryCountStr = Console.readLine();
		while (!TryCount.isValid(tryCountStr)) {
			racingCarView.printErrorMessageForTryCount();
			tryCountStr = Console.readLine();
		}
		return TryCount.from(tryCountStr);
	}

	private String readNameUntilValid() {
		String inputNames = Console.readLine();
		while (!Cars.isValidNames(inputNames)) {
			racingCarView.printErrorMessageForName();
			inputNames = Console.readLine();
		}
		return inputNames;
	}

}
