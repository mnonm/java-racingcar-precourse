package racinggame;

import nextstep.utils.Console;
import racinggame.model.Cars;
import racinggame.model.TryCount;
import racinggame.model.Winner;

public class RacingCarController {
	private final RacingCarView racingCarView;
	private final RacingCarOutputView racingCarOutputView;

	public RacingCarController(RacingCarView racingCarView, RacingCarOutputView racingCarOutputView) {
		this.racingCarView = racingCarView;
		this.racingCarOutputView = racingCarOutputView;
	}

	public void gameStart() {
		racingCarView.printStartMessage();
		String inputNames = readNameUntilValid();
		racingCarView.printRepeatCountMessage();
		TryCount tryCount = readTryCountUntilValid();
		Cars cars = Cars.from(inputNames);

		startAndPrintResult(tryCount, cars);
		printFinalWinnerResult(cars);
	}

	private void printFinalWinnerResult(Cars cars) {
		Winner winner = Winner.from(cars);
		racingCarOutputView.printWinner(winner);
	}

	private void startAndPrintResult(TryCount tryCount, Cars cars) {
		racingCarOutputView.printResultStart();
		for (int i = 0; i < tryCount.getValue(); i++) {
			cars.start();
			racingCarOutputView.printResult(cars);
		}
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
