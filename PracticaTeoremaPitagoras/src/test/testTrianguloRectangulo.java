package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	
	
	static TrianguloRectangulo t1;	// valores por mi 
	static TrianguloRectangulo t2;// default 
	
	@BeforeAll
	public static void setup() {
		t1 = new TrianguloRectangulo(4,3);
		t1.hipotenusa(); // esto es para rellenar la variable c.
		t2 = new TrianguloRectangulo();
		t2.hipotenusa();
	}
	

	@Test
	void testArea() {
		assertEquals(6, t1.area());
		
	}
	
	@Test
	void testAreadefault() {
		assertEquals(0.5, t2.area());
	}

	@Test
	void testHipotenusa() {
		assertEquals(5, t1.getC());
	}
	
	@Test
	void testHipotenusadefault() {
		assertEquals(1.4142135623730951, t2.getC());
	}

	@Test
	void testPerimetro() {
		assertEquals(12, t1.perimetro());
	}
	
	@Test
	void testPerimetrodefault() {
		assertEquals(3.414213562373095, t2.perimetro());
	}
	
	@Test
	void testExcepcion() {
		assertThrows(IllegalArgumentException.class, () -> {
			TrianguloRectangulo m2 = new TrianguloRectangulo(-1,3);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			TrianguloRectangulo m1 = new TrianguloRectangulo(1,-3);
		});
	}

	

}
