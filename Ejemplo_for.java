
public class Ejemplo_for {

	public static void main(String[] args) {
		System.out.println("Bucle 1.");
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		System.out.println("Bucle 2.");
		System.out.println("Este bucle muestra todos los números del 0 al  999 que son divisibles por 12");
		for (int i = 0; i < 1000; i++) {
			if (i % 12 == 0)
				System.out.println(i);
		}
		//Bucle 3
		System.out.println("Bucle 3. Tabla multiplicar 9.");
		for (int i = 1; i <= 200; i ++) {
			int multiple = 9 * i;
			System.out.println(multiple + " ");
		}
	}

}
