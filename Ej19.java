
public class Ej19 {
	public static void main(String[] args) {
		System.out.println("Introduce una cadena");
		String cadena = Teclado.leeCadena();

		System.out.println("Introduce un caracter");
		char caracter = Teclado.leeCaracter();

		int numerov = countCharacter(cadena, caracter);
		System.out.println(numerov);
	}

//countCharacter("Hola que tAl", 'a') -> 1
	public static int countCharacter(String cadena, char caracter) {
		int numeroVeces = 0;
		/*
		 * Tengo que recorrer mi cadena caracter a caracter y cada vez que el caracter
		 * recorrido coincida con caracter aumento en uno numeroVeces
		 */
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				numeroVeces++;
			}
		}
		return numeroVeces;

	}

}
