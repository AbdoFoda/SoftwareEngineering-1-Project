public class RegisterAsBuyer extends Register {

	private static String address;

	public User register() {
		boolean check = true;
		while (check == true) {
			System.out.print("Username: ");
			userName = takeStrInput();
			check = isItAUniqueUserName(BuyerDB.convertBuyersToUsers());
		}
		System.out.println("First Name : ");
		firstName = takeStrInput();
		System.out.println("last Name");
		lastName = takeStrInput();
		check = true;
		while (check == true) {
			System.out.print("Email: ");
			email = takeStrInput();
			check = isItAUniqueEmail(BuyerDB.convertBuyersToUsers());
		}
		System.out.println("password");
		password = takeStrInput();
		System.out.println("Phone Number : ");
		phoneNum = takeStrInput();
		return new User(userName, firstName, lastName, email, password, phoneNum);
	}

	public void RegisterForm() {
		Buyer buyer = (Buyer) register();
		System.out.println("Address");
		address = takeStrInput();
		buyer.setAddress(address);
		buyer.setVoucherCard(setVoucherCard());
		buyer.setCreditCard(setCreditCard());
		BuyerDB.addBuyer(buyer);
	}

}
