
public class EsCapicua {
	public static void main(String[] args) {
		System.out.println("Introduce un entero");
		int n = Teclado.leeEntero();
		if (esCapicua(n)) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}
	}

	public static boolean esCapicua(int n) {
		boolean b = false;
		if (n == invertirNumeroSB(n)) {
			b = true;
		}
		return b;
	}

	public static int invertirNumeroSB(int numero) {
		String sNum = String.valueOf(numero); // Pasamos el entero a string
		StringBuffer sb = new StringBuffer(sNum); // Creamos el string buffer
		sb.reverse(); // Le damos la vuelta
		int inverso = Integer.parseInt(sb.toString()); // pasamos el string a entero
		return inverso;
	}

}
