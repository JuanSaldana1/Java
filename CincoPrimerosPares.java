
public class CincoPrimerosPares {

	public static void main(String[] args) {
		int i=2;
		int contador=0;
		do {
			System.out.println(i);
			i=i+2;
			contador++;
		}while (contador<5);
		
		
		int j=1;
		int nPares=0;
		do {
			if(j%2==0) {
			System.out.println(j);			
			nPares++;}
			j++;
		}while (nPares<5);

	}

}
