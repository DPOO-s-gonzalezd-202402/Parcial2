package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {
	
	private Parcial parcial;

	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void testHayRaices() {
		assertTrue(this.parcial.hayRaicesReales(1, 0, -2));
		assertFalse(this.parcial.hayRaicesReales(1, 0, 2));
	}
	
	@Test
	public void testCalcularRaices() throws Exception{
		assertEquals(1.0, this.parcial.calcularRaices(1, 0, -1)[0]);
		assertEquals(-1.0, this.parcial.calcularRaices(1, 0, -1)[1]);
		assertEquals(2.0, this.parcial.calcularRaices(1, 0, -2)[0]);
		assertEquals(-2.0, this.parcial.calcularRaices(1, 0, -2)[1]);
	}
	@Test
	public void testExcepciones() throws Exception{
		assertThrows(Exception.class, () -> this.parcial.calcularRaices(1,0, 2));
		assertThrows(Exception.class, () -> this.parcial.calcularRaices(0,0, 0));
		assertThrows(Exception.class, () -> this.parcial.calcularRaices(0,0, 10));
	}
}
