import java.util.ArrayList;
import java.util.Scanner;

public abstract class Register {
	protected static String userName;
	protected static String firstName;
	protected static String lastName;
	protected static String email;
	protected static String password;
	protected static String phoneNum;

	public abstract void RegisterForm();

	protected static boolean isItAUniqueUserName(ArrayList<User> owners) {
		boolean exist = false;
		for (int i = 0; i < owners.size(); i++) {
			if (owners.get(i).getUserName().equals(userName)) {
				exist = true;
			}
		}
		if (exist == true)
			message("username");
		return exist;
	}

	protected static boolean isItAUniqueEmail(ArrayList<User> owners) {
		boolean exist = false;
		for (int i = 0; i < owners.size(); i++) {
			if (owners.get(i).getUserName().equals(email)) {
				exist = true;
			}
		}
		if (exist == true)
			message("email");
		return exist;
	}

	protected static void message(String inputType) {
		System.out.println("This " + inputType + " is already taken choose another one.");
	}

	protected static void done() {
		System.out.println("Registration Done :)");
		EntryPage entry = new EntryPage();
		entry.displayPage();
	}

	public static VoucherCard setVoucherCard() {
		System.out.print("Value: ");
		double value = Input.takeDoubleInput();
		System.out.println("Serial Numbe : ");
		String serialNumber = Input.takeStrInput();
		return new VoucherCard(value, serialNumber);
	}

	public static CreditCard setCreditCard() {
		System.out.print("Number: ");
		String number = Input.takeStrInput();
		System.out.println("Security Code: ");
		String securityCode = Input.takeStrInput();
		System.out.println("Expiration Date: ");
		String expirationDate = Input.takeStrInput();
		return new CreditCard(number, securityCode, expirationDate);
	}
}