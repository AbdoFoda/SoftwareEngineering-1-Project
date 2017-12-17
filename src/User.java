import java.util.Scanner;

public class User {

	protected String userName, firstName, lastName, email, password, phoneNum;

	public User(String userName, String firstName, String lastName, String email, String password, String phoneNum) {
		this.userName = userName;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
	}

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

	public void setUserName(String name) {
		this.userName = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPhoneNum(String num) {
		this.phoneNum = num;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

}