
public class Ej14 {

	public static void main(String[] args) {
		System.out.println("Introduce un entero");
		int n=Teclado.leeEntero();
		for (int i=1; i<n; i++) {
			if(esArmstrong(i)) {
		System.out.println(i);}
		}
	}
	
	//153
	public static boolean esArmstrong(int n) {
		boolean arm=false;
		
		int digito1=n/100; //(153/100=1)
		int digito2=(n/10)%10;// (153/10=15; 15%10=5)
		int digito3=n%10; //(153%10=3)
		
		if(Math.pow(digito1, 3)+Math.pow(digito2, 3)+Math.pow(digito3, 3)==n)
		{
			arm=true;
		}
		
		
		return arm;
	}

}
