package clases;

public class TrianguloRectangulo {
	
	private int a , b;
	private double c;
	
	/****
	 * Constructor sin parametros que inicializa a 1 ambos catetos.
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	/****
	 * Constructor con 2 parametros, 1 por cada cateto
	 * @param a int 
	 * @param b int 
	 */
	public TrianguloRectangulo(int a , int b) {
		if(a <= 0 || b<= 0) throw new IllegalArgumentException();
		this.a = a;
		this.b = b;
	}
	
	/****
	 * Metodo que calcula el area del triangulo
	 * @return double
	 */
	public double area() {
		// aqui meto esta variable porque al ser a y b enteros si lo hacia
		// directamente el resultado del debug me lo hacia int.
		double area = this.a*this.b;
		return (area)/2;
	}
	
	/****
	 * Guarda el valor de la hipotenusa y devuelve ese valor
	 * @return double
	 */
	public double hipotenusa() {
		this.c = Math.sqrt((Math.pow(this.a, 2)) + (Math.pow(this.b, 2)) );
		return this.c;
	}
	
	/****
	 * Metodo que calcula el perimetro del triangulo
	 * @return double
	 */
	public double perimetro() {
		//aqui aunque existe la variable c no la llamo directamente porque si no se ha ejecutado el
		// metodo hipotenusa anteriormente esta variable c estaria vacia por lo que no es seguro.
		return this.a + this.b + hipotenusa();
	}

	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	
	@Override
	public String toString() {
		return "TrianguloRectangulo [Cateto a= " + a + ", Cateto b= " + b + ", Hipotenusa= " + c + "]";
	}
	
	
	
	
	
	

}
