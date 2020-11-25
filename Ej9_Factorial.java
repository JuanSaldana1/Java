
public class Ej9_Factorial {
public static void main(String[] args) {
	System.out.println("Introduce un entero");
	int n=Teclado.leeEntero();
	System.out.println(factorial(n));
	System.out.println(factorial2(n));
}

//Factorial de 5 - 2*3*4*5
//Paso 1: factorial=2
//Paso 2: factorial=2*3=6
//Paso 3: factorial=6*4=24
//Paso 4: factorial=24*5=120
//Paso 5: sale del bucle
public static long factorial(int n) {
	long factorial=1;
	for(int i=2;i<=n;i++) {
		factorial=factorial*i;
	}
	
	return factorial;
}

//Factorial 5 - 5*4*3*2
//Paso 1: i=5 /  factorial 5
//Paso 2: i=4 / factorial 20
//Paso 3: i=3/ factorial 60
//Paso 4: i=2/ factorial 120
//Paso 5: i=1/ se sale

public static long factorial2(int n) {
	long factorial=1;
	for(int i=n;i>1;i--) {
		factorial=factorial*i;
	}
	
	return factorial;
}
}
