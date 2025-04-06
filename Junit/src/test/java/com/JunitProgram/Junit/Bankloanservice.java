package com.JunitProgram.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Bankloanservice {

	@Test
	public void testcalcSimpleIntrestAmountWithSmallNumber() {
		Banklaonservice service = new Banklaonservice();
		double actual = service.calcSimpleIntrestAmount(100000.0, 2.0, 12.0);
		double expected = 24000.0f;
		assertEquals(expected, actual);
	}

}
