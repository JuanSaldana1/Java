
public class Ej5 {
	public static void main(String[] args) {
		
		System.out.println("Introduce un entero");
		int n=Teclado.leeEntero();
		System.out.println(esPrimo(n));

	}
	
	public static boolean esPrimo(int n) {
		
		boolean esP=true;
		
		for (int i=2;i<n/2;i++) {
			if(n%i==0) {//Tiene un divisor distinto de si mismo y la unidad
				esP=false;
			}
		}
		return esP;
	}
}
