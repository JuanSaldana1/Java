

public class Ej13 {

	public static void main(String[] args) {
		/*
		 
		 ....1
		 ...2.
		 ..3..
		 .4...
		 5...
		 
		
		
		11111
		22222
		33333
		44444
		55555
		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 6-i) {
					System.out.print(i);
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
