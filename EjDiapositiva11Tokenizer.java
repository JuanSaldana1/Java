import java.util.StringTokenizer;

public class EjDiapositiva11Tokenizer {
public static void main(String[] args) {
	String str2="Juan\n5.5\nAmelia\n8.6\nAlejandro\n2.0";
	
	 StringTokenizer st2=new StringTokenizer(str2,"\n");
	 while(st2.hasMoreTokens()) {
		 String nombre=st2.nextToken();
		 String nota=st2.nextToken();
		 System.out.println("El alumno"+nombre+"ha sacado un"+nota);}
	 }
	
}

