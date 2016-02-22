package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		assertNotNull(calc);
	}

	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(calc.getTotal(), 0);
	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(4);
		assertEquals(4,calc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.subtract(4);
		assertEquals(-4,calc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.multiply(4);
		assertEquals(0,calc.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.divide(0);
		assertEquals(0,calc.getTotal());
	}

	@Test
	public void testGetHistory() {
		Calculator cal = new Calculator();
		cal.add(4);
		cal.subtract(2);
		cal.multiply(2);
		cal.add(5);
		assertEquals("0 + 4 - 2 * 2 + 5",cal.getHistory());
	}

}
