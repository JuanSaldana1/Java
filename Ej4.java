
public class Ej4 {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce un entero");
			int n = Teclado.leeEntero();
			if (esPar(n)) {
				System.out.println("El número " + n + " es par. \n");
			} else {
				System.out.println("El número " + n + " es impar. \n");
			}
			System.out.flush();
		}
	}

	public static boolean esPar(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
