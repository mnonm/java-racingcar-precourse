package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {
	@Test
	void 자동차_이름_5자_넘는_경우() {
		Name result = Name.from("123456");

		assertThat(result.isValid()).isFalse();
	}

	@ParameterizedTest
	@ValueSource(strings = {"", "1", "12345"})
	void 자동차_이름_5자_이하인_경우() {
		Name result = Name.from("12345");

		assertThat(result.isValid()).isTrue();
	}
}
