package racinggame;

public class RacingCarView {
	public void printStartMessage() {
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
	}

	public void printErrorMessageForName() {
		System.out.println("[ERROR] 자동차 이름은 5자 이하만 가능합니다. 다시 입력하세요.");
	}
}
