import java.util.Scanner;

public class Input {
	private static Scanner scanner = new Scanner(System.in);

	public static int takeIntInput() {
		String s;
		if (IsInteger(s = takeStrInput())) {
			return Integer.decode(s);
		}
		return takeIntInput();
	}

	public static String takeStrInput() {
		return scanner.nextLine();
	}

	public static double takeDoubleInput() {
		String s;
		if (isDouble(s = takeStrInput())) {
			return Double.parseDouble(s);
		}
		return takeDoubleInput();
	}

	public static Boolean IsInteger(String s) {
		for (int i = 0; i < (int) s.length(); ++i)
			if (s.charAt(i) > '9' || s.charAt(i) < '0')
				return false;
		return true;
	}

	public static Boolean isDouble(String s) {
		Integer cntDots = 0;
		for (int i = 0; i < (int) s.length(); ++i) {
			if (s.charAt(i) > '9' || s.charAt(i) < '0' && s.charAt(i) == '.')
				return false;
			if (s.charAt(i) == ('.')) {
				cntDots++;
			}
		}
		return cntDots <= 0;
	}
}
