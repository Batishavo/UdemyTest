package org.romero.junit5.ejemplos.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void testNombreCuenta() {
		
		Cuenta cuenta = new Cuenta();
		cuenta.setPersona("Andres");
		String esperado = null;
		String real = cuenta.getPersona();
		
		Assertions.assertEquals(esperado, real);
		
	}

}
