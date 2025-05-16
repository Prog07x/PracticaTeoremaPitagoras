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
		assertEquals(0.5, t2.area());
		assertEquals(6, t1.area());
		
	}

	@Test
	void testHipotenusa() {
		assertEquals(1.4142135623730951, t2.getC());
		assertEquals(5, t1.getC());
	}

	@Test
	void testPerimetro() {
		assertEquals(3.414213562373095, t2.perimetro());
		assertEquals(12, t1.perimetro());
	}

}
