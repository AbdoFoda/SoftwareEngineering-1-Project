public class RegisterAsBuyer extends Register {

	private static String address;

	public User register() {
		boolean check = true;
		while (check == true) {
			System.out.print("Username: ");
			userName = Input.takeStrInput();
			check = isItAUniqueUserName(BuyerDB.convertBuyersToUsers());
		}
		System.out.println("First Name : ");
		firstName = Input.takeStrInput();
		System.out.println("last Name");
		lastName = Input.takeStrInput();
		check = true;
		while (check == true) {
			System.out.print("Email: ");
			email = Input.takeStrInput();
			check = isItAUniqueEmail(BuyerDB.convertBuyersToUsers());
		}
		System.out.println("password");
		password = Input.takeStrInput();
		System.out.println("Phone Number : ");
		phoneNum = Input.takeStrInput();
		return new User(userName, firstName, lastName, email, password, phoneNum);
	}

	public void RegisterForm() {
		Buyer buyer = (Buyer) register();
		System.out.println("Address");
		address = Input.takeStrInput();
		buyer.setAddress(address);
		buyer.setVoucherCard(setVoucherCard());
		buyer.setCreditCard(setCreditCard());
		BuyerDB.addBuyer(buyer);
	}

}
