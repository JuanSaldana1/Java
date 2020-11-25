
public class Omirp {
public static void main(String[] args) {
	//System.out.println(invertirNumero(7898));
	//System.out.println(invertirNumeroFor(7898));
	
	System.out.println(esOmirp(7951));
	System.out.println(esOmirp(7952));
}


//7865
//Paso 1 - inverso=5 / numero=786
//Paso 2 - cifra=6 / inverso=56 /Número=78
//Paso 3 - cifra=8/ inverso=568 / Número=7
//Paso 4 - cifra=7 /inverso=5687 / Número=0
private static int invertirNumero(int numero){
    int cifra, inverso = 0;
    while(numero!=0){
        cifra = numero%10;
        inverso = (inverso * 10) + cifra;
        numero/=10;
    }
    return inverso;
}


public static int invertirNumeroFor(int numero) {
			
		int cifra, inverso = 0;
		for(;numero>0;numero/=10){
		        cifra = numero%10;
		        inverso = (inverso * 10) + cifra;
		         
		    }
		    return inverso;
}

public static int invertirNumeroSB(int numero) {
	String sNum=String.valueOf(numero); //Pasamos el entero a string
	StringBuffer sb=new StringBuffer(sNum); //Creamos el string buffer
	sb.reverse(); //Le damos la vuelta
	int inverso=Integer.parseInt(sb.toString()); //pasamos el string a entero
	return inverso;
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

public static boolean esOmirp(int n) {
	boolean omirp=false;
	if(esPrimo(n)&&esPrimo(invertirNumeroFor(n))) {
		omirp=true;
	}
	return omirp;
}


}
