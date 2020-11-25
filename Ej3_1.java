

public class Ej3_1 {

	public static void main(String[] args) {
		//EJERCICIO 2 SIN CONTINUE
		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0){
				System.out.println(i);
			}
		}
		
		System.out.println("");
		//EJERCICIO 2 CONTINUE
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0){
				continue;
			}
			System.out.println(i);
		}

	}

}
