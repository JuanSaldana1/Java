
public class Ej18 {

	public static void main(String[] args) {
		System.out.println("Introduce tu nombre completo");
		String nombre = Teclado.leeCadena();
		escribeIniciales(nombre.trim());
		
		
	}

	// Pepe Perez García -> PPG
	public static void escribeIniciales(String nombre) {
		System.out.print(nombre.charAt(0));
		for (int i=1; i<nombre.length();i++) {
			char michar=nombre.charAt(i);
			if(michar==' ') {
		System.out.print(nombre.charAt(i+1));}}
		
	}
}
