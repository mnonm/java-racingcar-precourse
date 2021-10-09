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

	@Test
	void 랜덤값이_4이상일_경우_전진() {
		Car car = Car.create("test");

		car.start(4);

		assertThat(car.getPosition().getValue()).isEqualTo(1);
	}

	@Test
	void 랜덤값이_4미만일_경우_멈춤() {
		Car car = Car.create("test");

		car.start(3);

		assertThat(car.getPosition().getValue()).isEqualTo(0);
	}

	@Test
	void start_반복_4이상_3회_4미만_2회() {
		Car car = Car.create("test");

		car.start(5);
		car.start(9);
		car.start(0);
		car.start(3);
		car.start(7);

		assertThat(car.getPosition().getValue()).isEqualTo(3);
	}
}
