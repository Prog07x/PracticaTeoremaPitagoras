package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		
		TrianguloRectangulo t1 = new TrianguloRectangulo((int)(Math.random()*11),(int)(Math.random()*11));
		
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		
		double areat1 = t1.area();
		double areat2 = t2.area();
		
		double pt1 = t1.perimetro();
		double pt2 = t2.perimetro();
		

	}

}
