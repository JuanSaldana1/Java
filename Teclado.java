import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Teclado {
	public static char leeCaracter() {
		char ch;
		try {
			ch = leeCadena().charAt(0);
		} catch (Exception e) {
			ch = 0;
		}
		return ch;
	}

	public static String leeCadena() {
		Scanner sc = new Scanner(System.in);//esta
		
		String str;
		try {
			str = sc.nextLine();//esta
			
		} catch (Exception e) {
			str = "";
			sc.close(); //esta
		}
		return str;
	}

	public static int leeEntero() {
		int num;
		try {
			num = Integer.parseInt(leeCadena().trim());
		} catch (Exception e) {
			num = 0;
		}
		return num;
	}
	
	public static long leeEnteroLargo() {
		long num;
		try {
			num = Long.parseLong(leeCadena().trim());
		} catch (Exception e) {
			num = 0;
		}
		return num;
	}
}
