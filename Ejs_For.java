
public class Ejs_For {

	public static void main(String[] args) {
		/* Mostrar los números del 0 al 999 */
		System.out.println("Bucle 1");
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}

		/* Mostrar los números divisibles por 12 del 0 al 999 */
		System.out.println("Bucle 2");
		for (int i = 0; i < 1000; i++) {
			if (i % 12 == 0) {
				System.out.println(i);
			}
		}

		/* Mostrar los 200 primeros múltiplos de 9 */
		System.out.println("Bucle 3");
		for (int i = 1; i <= 200; i++) {
			int multiplo = i * 9;
			System.out.println("Múltiplo: " + multiplo);

		}

	}

}
