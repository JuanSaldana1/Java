package Ejemplo_Materias;

public class Subjects {

	public static void main(String[] args) {
		int matematicas = 4, lengua = 2;
		if (matematicas >= 5) {
			if (lengua >= 5) {
				System.out.println("Enhorabuena, has aprobado.");
			} else {
				System.out.println("No has aprobado todas las asignaturas.");
			}
		} else {
			System.out.println("No has aprobado todas las asignaturas.");
		}
	}
}
