

public class Ej12_1 {

	public static void main(String[] args) {
		/*
		 
		 ....1
		 ...22
		 ..333
		 .4444
		 55555
		 
		
		
		11111
		22222
		33333
		44444
		55555
		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j > 5-i) {
					System.out.print(i);
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
