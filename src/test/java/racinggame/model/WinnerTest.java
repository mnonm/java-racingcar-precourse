package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class WinnerTest {
	@Test
	void 자동차가_하나만_있는_경우() {
		Cars cars = Cars.from("1");

		Winner winner = Winner.from(cars);

		assertThat(winner.getCars().getValues().size()).isEqualTo(1);
		assertThat(winner.getCars().getValues().get(0).getName().getValue()).isEqualTo("1");
	}

	@Test
	void 우승자_구하기() {
		// given
		Car car1 = Car.create("1");
		Car car2 = Car.create("2");

		car1.start(2);
		car2.start(5);

		Cars cars = Cars.from(Arrays.asList(car1, car2));

		// when
		Winner result = Winner.from(cars);

		// then
		assertThat(result.getCars().getValues().size()).isEqualTo(1);
		assertThat(result.getCars().getValues().get(0).getName().getValue()).isEqualTo("2");
		assertThat(result.getCars().getValues().get(0).getPosition().getValue()).isEqualTo(1);
	}

	@Test
	void 우승자_여러명인_경우() {
		// given
		Car car1 = Car.create("1");
		Car car2 = Car.create("2");
		Car car3 = Car.create("3");

		car1.start(2);
		car2.start(5);
		car3.start(6);

		Cars cars = Cars.from(Arrays.asList(car1, car2, car3));

		// when
		Winner result = Winner.from(cars);

		// then
		assertThat(result.getCars().getValues().size()).isEqualTo(2);

		assertThat(result.getCars().getValues().get(0).getName().getValue()).isEqualTo("2");
		assertThat(result.getCars().getValues().get(0).getPosition().getValue()).isEqualTo(1);

		assertThat(result.getCars().getValues().get(1).getName().getValue()).isEqualTo("3");
		assertThat(result.getCars().getValues().get(1).getPosition().getValue()).isEqualTo(1);
	}

}