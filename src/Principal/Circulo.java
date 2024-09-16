package Principal;

public class Circulo {

	Punto centro;
	double radio;

	public Circulo(Punto punto, double r) {

		this.centro = punto;
		this.radio = r;
	}

	public boolean intersectaCon(Circulo c2) {

		double distancia = Math
				.sqrt(Math.pow(c2.centro.x - this.centro.x, 2) + Math.pow(c2.centro.y - this.centro.y, 2));

		System.out.println("Distancia:" + distancia);

		return distancia <= (this.radio + c2.radio);
	}

}
