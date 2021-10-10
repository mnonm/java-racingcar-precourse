package racinggame;

import racinggame.controller.RacingCarController;
import racinggame.view.RacingCarOutputView;
import racinggame.view.RacingCarView;

public class Application {
	public static void main(String[] args) {
		RacingCarController racingCarController =
			new RacingCarController(new RacingCarView(), new RacingCarOutputView());

		racingCarController.gameStart();
	}
}
