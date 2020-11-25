package Estructuras_condicionales;

public class Switch {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("You got an A.");
			break;
		case 'B':
			System.out.println("You got a B.");
			break;
		case 'C':
			System.out.println("You got a C.");
			break;
		default:
			System.out.println("You got an F.");
		}
	}

}
