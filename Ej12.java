public class Ej12 {

	public static void main(String[] args) {
		int n = 5;// n toma el valor inicial de 5
		for (int i = 1; i <= 5; i++) {// lo limita a cinco y cuando llega a 5, pasa al siguiente bucle
			for (int j = 1; j <= n - i; j++) {// lo pone en uno, es menor o igual que 5?, no, vuelvo a hacerlo y sumo
												// uno porque i vale 1.
				System.out.print(".");// 5-2 0 3 como j vale 3 y comno 3 es menor igual que 3 pues paso al siguiente
										// punto
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
