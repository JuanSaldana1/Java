
public class EjStringBuffer {
public static void main(String[] args) {
	//Constructores
	StringBuffer sb1=new StringBuffer();
	StringBuffer sb2=new StringBuffer(8);
	StringBuffer sb3=new StringBuffer("Hola que tal");
	
	//Longitud
	System.out.println(sb1.length());
	System.out.println(sb2.length());
	System.out.println(sb3.length());
	
	//Añadir datos
	sb1.append(23);
	System.out.println(sb1.length());
	System.out.println(sb1.toString());
	sb1.append("Hola");
	System.out.println(sb1.length());
	System.out.println(sb1.toString());
	
	sb1.insert(2,"adios");
	System.out.println(sb1.length());
	System.out.println(sb1.toString());
     //Métodos de manipulación de contenido
	
	sb1.delete(2,4);
	System.out.println(sb1.length());
	System.out.println(sb1.toString());
	
	sb1.setLength(3);
	System.out.println(sb1.length());
	System.out.println(sb1.toString());
	
	sb1.setCharAt(1, 'j');
	System.out.println(sb1.toString());
	
	sb1.replace(0, 1, "que tal estas");
	System.out.println(sb1.toString());
	sb1.replace(1, 2, "que tal estas");
	System.out.println(sb1.toString());
	sb1.replace(1, 3, "que tal estas");
	System.out.println(sb1.toString());
	
	sb1.reverse();
	System.out.println(sb1.toString());
	
	//El entero a String
	int n=1456;
	String sNum=String.valueOf(n);
	StringBuffer sb=new StringBuffer(sNum);
	System.out.println(sb.toString());
	sb.reverse();
	int ninv=Integer.parseInt(sb.toString()); //pasar de String a int
	System.out.println(ninv);
	
	
}
}
