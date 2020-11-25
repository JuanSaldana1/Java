package Excepciones;

public class Error {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {
		c = a / b;
		}catch(Exception e){
			System.err.println("Error: " + e.getMessage());
			return;
		}
		System.out.println("Resultado: " + c);
	}
}
