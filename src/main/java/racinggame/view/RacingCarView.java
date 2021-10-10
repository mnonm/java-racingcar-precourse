package racinggame.view;

public class RacingCarView {
	public void printStartMessage() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
	}

	public void printErrorMessageForName() {
		System.out.println("[ERROR] 자동차 이름은 5자 이하만 가능합니다. 다시 입력하세요.");
	}

	public void printRepeatCountMessage() {
		System.out.println("시도할 회수는 몇회인가요?");
	}

	public void printErrorMessageForTryCount() {
		System.out.println("[ERROR] 반복 횟수는 숫자만 가능합니다. 다시 입력하세요.");
	}
}
