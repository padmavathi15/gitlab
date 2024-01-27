package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calciTest {

	@Test
	public void calciTestadd() {
		assertEquals(31, calculator.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, calculator.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, calculator.multi(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, calculator.div(30, 5));
	}

	

}
