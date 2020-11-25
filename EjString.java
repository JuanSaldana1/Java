
public class EjString {

	public static void main(String[] args) {
		// Longitud
		String s = "Hola";
		System.out.println(s.length()); // longitud del string

		System.out.println(s.isEmpty()); // Devuelvo si el string es vacio
		String vacio = "";
		System.out.println(vacio.isEmpty());

		// Comparación
		System.out.println(s.equals("Hola"));
		System.out.println(s.equals("hola"));

		System.out.println(s.equalsIgnoreCase("hola"));

		System.out.println(s.compareTo("Pepe"));
		System.out.println(s.compareTo("Hola"));
		System.out.println(s.compareTo("Hoe"));

		System.out.println(s.compareToIgnoreCase("aa"));

		System.out.println(s.startsWith("H"));
		System.out.println(s.startsWith("o", 1));
	}

}
