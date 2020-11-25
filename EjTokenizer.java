import java.util.StringTokenizer;

public class EjTokenizer {

//Dada un String de enteros separados por el delimitador yyy, 
//desarrolla una función que calcule el mayor entero
public static void main(String[] args) {
	
	String s="8yyy98yyy558yyy23yyy23yyy12yyy100yyy6";
	System.out.println(maxEnteroLista(s));
}

public static int maxEnteroLista(String str) {
	
	int max=0;
	 StringTokenizer st=new StringTokenizer(str,"yyy");
	 
	 //->8
	 //98
	 //55
	 //23
	 //23
	 //12
	 //100
	 //6
	 while(st.hasMoreTokens()) {
		 String token=st.nextToken();
		 int nToken=Integer.parseInt(token);
		 if(nToken>max) {
			 max=nToken;
		 }
	
	 }
	 
	 return max;
}
}
