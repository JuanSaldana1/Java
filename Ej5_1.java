

import java.util.Scanner;

public class Ej5_1 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int n;
		
		System.out.println("Introduzca un numero: ");
		n = lector.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("El numero es par.4");
		}else{
			System.out.println("El numero es impar.");
		}
	}

}
