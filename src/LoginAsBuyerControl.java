public class LoginAsBuyerControl extends LoginControl {

	public HomePage login(String Identifier, String password) {
		System.out.println("Username Or Email: ");
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		BuyerHomePage ret = new BuyerHomePage();
		ret.setBuyer((Buyer) returnUser(BuyerDB.convertBuyersToUsers()));
		return ret;
	}

}
