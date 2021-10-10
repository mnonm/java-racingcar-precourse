package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarsTest {
	@Test
	void Cars_생성() {
		Cars cars = Cars.from(Names.of("1,2,3,4,5"));

		assertThat(cars.getValues().size()).isEqualTo(5);
	}

	@Test
	void 이름이_5자가_넘는_경우() {
		assertThatIllegalArgumentException()
			.isThrownBy(() -> Cars.from(Names.of("1,123456,2,3,4,5")));
	}

	@Test
	void 이름이_5자_초과_유효성_검사() {
		assertThat(Cars.isValidNames("1,123456,2,3,4,5,")).isFalse();
	}

	@Test
	void 이름이_5자_이하_유효성_검사() {
		assertThat(Cars.isValidNames("1,12345,2,3,4,5,")).isTrue();
	}
}