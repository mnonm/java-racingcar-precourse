package racinggame;

public class RacingCarController {
	private final RacingCarView racingCarView;

	public RacingCarController(RacingCarView racingCarView) {
		this.racingCarView = racingCarView;
	}

	public void gameStart() {
		racingCarView.printStartMessage();
	}
}
