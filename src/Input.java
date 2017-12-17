import java.util.Scanner;

public class Input {
	public static int takeIntInput() {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();
		return input;
	}

	public static String takeStrInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}

	public static double takeDoubleInput() {
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		scanner.close();
		return input;
	}
}
