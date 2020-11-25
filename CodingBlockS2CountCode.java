
public class CodingBlockS2CountCode {
public static void main(String[] args) {
	System.out.println(countCode("AAcodeBBcoleCCccoreDD"));
}


public static int countCode(String str) {
	  
int contador=0;

 for(int i = 0; i < str.length() - 3; i++) {
 char caracter1=str.charAt(i);	 
 char caracter2=str.charAt(i + 1);
 char caracter4=str.charAt(i + 3);
  
 if(caracter1 == 'c' && caracter2 == 'o' && caracter4== 'e')

 contador++;

 }

return contador;

}

}
