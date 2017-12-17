public class LoginAsBuyerControl extends LoginControl {

	public HomePage login(String Identifier, String password) {
		Buyer user = BuyerDB.getBuyer(Identifier);
		if (user == null || !user.getPassword().equals(password))
			return null;
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		BuyerHomePage ret = new BuyerHomePage();
		ret.setBuyer((Buyer) returnUser(BuyerDB.convertBuyersToUsers()));
		return ret;
	}

}
