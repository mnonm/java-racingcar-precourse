package racinggame.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {
	@Test
	void 자동차_이름_5자_넘는_경우() {
		assertThat(Name.isValid("123456")).isFalse();
	}

	@ParameterizedTest
	@ValueSource(strings = {"", "1", "12345"})
	void 자동차_이름_5자_이하인_경우(String name) {
		assertThat(Name.isValid(name)).isTrue();
	}
}
