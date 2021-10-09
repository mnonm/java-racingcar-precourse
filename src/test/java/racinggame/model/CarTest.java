package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	void 자동차_생성() {
		Car car = Car.create("test");

		assertThat(car.getName().getValue()).isEqualTo("test");
		assertThat(car.getPosition().getValue()).isEqualTo(0);
	}
}
