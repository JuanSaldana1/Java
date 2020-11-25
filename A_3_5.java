

public class A_3_5 {
	public static void main(String[] args) {
		int i = 2;
		do {
			System.out.println(i);
			i+=2;
		}while(i <=10);
		
		//SIMILAR A LA ANTERIOR SIN TENER QUE HACER CALCULOS
		System.out.println();
		i = 2;
		do {
			System.out.println(i);
			i+=2;
		}while(i <=(2*5));
		
		//NO EFICIENTE
		System.out.println();
		i = 1;
		do {
			if (i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}while(i <= 10);
		
		//ELEGANTE
		System.out.println();
		i = 1;
		do {
			System.out.println(i*2);
			i++;
		}while(i <= 5);
		
		//ELEGANTE REDUCIDA
		System.out.println();
		i = 1;
		do
			System.out.println(i++ * 2);
		while(i <= 5);
		
	}
}
