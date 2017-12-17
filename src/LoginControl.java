import java.util.ArrayList;
import java.util.Scanner;

public abstract class LoginControl {
	static String Identifier, password;

	public static String takeStrInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}

	protected static User returnUser(ArrayList<User> users) {
		User exist = null;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getUserName().equals(Identifier) && users.get(i).getPassword().equals(password)) {
				exist = users.get(i);
				break;
			}
			if (users.get(i).getEmail().equals(Identifier) && users.get(i).getPassword().equals(password)) {
				exist = users.get(i);
				break;
			}
		}
		if (exist == null)
			message();
		return exist;
	}

	protected static void message() {
		System.out.println("There is sth wrong with your informatiom.");

	}

	public abstract HomePage login(String Identifier, String password);
}
