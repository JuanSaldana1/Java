import java.util.StringTokenizer;

public class A_3_11 {

	public static void main(String[] args) {
		String s = "Juan\n5.5\nAmelia\n8.6\nAlejandro\n2.0";
		String nReverse;
		StringTokenizer tokens = new StringTokenizer(s);
		StringBuffer n = new StringBuffer();
		while (tokens.hasMoreTokens()) {
			n.insert(0, tokens.nextToken());
			if (tokens.hasMoreTokens()) {
				n.insert(0, "\n");
			}
		}
		nReverse = n.toString();
		System.out.print("El alumno " + nReverse + " ha sacado un " + nReverse);
	}
}