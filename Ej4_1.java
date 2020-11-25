

import java.util.Scanner;

public class Ej4_1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int n;
		
		System.out.println("Introduzca un numero: ");
		n = lector.nextInt();
		
		//COMO NO SE DEBE: CON BREAK
		boolean esPrimo = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				esPrimo = false;
				break;
			}
		}
		
		if (esPrimo) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
		//COMO SE DEBE: SIN BREAK
		esPrimo = true;
		for (int i = 2; i < n && esPrimo; i++) {
			if (n % i == 0) {
				esPrimo = false;
			}
		}
		
		if (esPrimo) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		
		
	}

}
