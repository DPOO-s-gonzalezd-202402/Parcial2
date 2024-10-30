package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

import logica.Parcial;

class ParcialTest1 {
	private int a=1;
	private int b=1;
	private int c=1;
	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		this.parcial= new Parcial();
	}
	
	@Test
	void test() {
		assertEquals(-2.0, this.parcial.calcularRaices(1, 0, -2)[0]);
	}
	@
}
