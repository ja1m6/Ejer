
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Ejer_Test {
	static Ejer tester;
	@BeforeAll
	static void Beforeall() {
		tester = new Ejer();
	}

	@Test
	public void sumados() {
		int array[] = {};
		assertEquals(0, tester.sumados(array));
	}

}
