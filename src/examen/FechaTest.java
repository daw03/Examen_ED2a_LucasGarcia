package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	
	Fecha f = new Fecha();

	@Test
	void CP1() {
		assertFalse(f.validarFecha(-1,1,1));
	}
	
	@Test
	void CP2() {
		assertFalse(f.validarFecha(1,-1,1));
	}
	
	@Test
	void CP3() {
		assertFalse(f.validarFecha(1,1,-1));
	}
	
	@Test
	void CP4() {
		assertFalse(f.validarFecha(1,13,1));
	}
	
}
