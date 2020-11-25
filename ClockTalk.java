import java.util.*;

public class ClockTalk {

	public static void main(String[] args) {
		// get current time and date
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH + 1);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int year = now.get(Calendar.YEAR);

		System.out.println(now.getTime());

		// Crear una fecha fija
		Calendar sameDate = new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44);

		// mostrar los agradecimientos
		if (hour < 12)
			System.out.println("Buenos días. \n");
		else if (hour < 17)
			System.out.println("Buenas tardes. \n");
		else
			System.out.println("Buenas noches charAt(\n)");

		// Mostrar minutos
		System.out.println("It is");
		if (minute != 0) {
			System.out.print(" " + minute + " ");
			System.out.print((minute != 1) ? "minutes" : "minute");
			System.out.print(" past");
		}
		// Mostrar la hora
		System.out.print(" ");
		System.out.print((hour > 12) ? (hour - 12) : hour);
		System.out.print(" o'clock on \n");

		// Mostrar el mes

		System.out.print("Estamos en el mes de: ");
		switch (month) {
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");

		}
	}

}
