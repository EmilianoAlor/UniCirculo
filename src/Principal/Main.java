package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		System.out.println(c1.intersectaCon(c2)); // true
	}

}
