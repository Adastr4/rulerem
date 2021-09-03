package cart.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReadExcelTest {

	@Test
	void testReadValues() {
		new ReadExcel().readValues(0);
	}

}
