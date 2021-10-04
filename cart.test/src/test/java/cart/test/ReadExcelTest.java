package cart.test;

import org.junit.jupiter.api.Test;

import cart.prove.ReadExcel;

class ReadExcelTest {

	@Test
	void testReadValues() {
		new ReadExcel().readValues(0);
	}

}
