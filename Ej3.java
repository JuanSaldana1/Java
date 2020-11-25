
public class Ej3 {
	public static void main(String[] args) {

		dosAdos(2, 7, 4);
		dosAdos(10, 6, 4);
	}

	public static void dosAdos(int a, int b, int c) {
		if (a + b == c) {
			System.out.println(a + " + " + b + " = " + c);
		} else if (a + c == b) {
			System.out.println(a + " + " + c + " = " + b);
		} else if (b + c == a) {
			System.out.println(b + " + " + c + " = " + a);
		} else {
			System.out.println("No hay resultado");
		}
	}
}
