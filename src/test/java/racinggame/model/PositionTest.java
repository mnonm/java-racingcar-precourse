package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositionTest {
	@Test
	void 위치_초기화() {
		Position result = Position.init();

		assertThat(result.getValue()).isEqualTo(0);
	}

}