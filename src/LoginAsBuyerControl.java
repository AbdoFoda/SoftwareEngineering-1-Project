public class LoginAsBuyerControl extends LoginControl {

	public HomePage login(String Identifier, String password) {
		User user = UserDB.getUser(Identifier);
		if (user == null || password != user.getPassword()	|| !(user instanceof Buyer) )
			return null;
		LoginControl.Identifier = Identifier;
		LoginControl.password = password;
		BuyerHomePage ret = new BuyerHomePage();
		ret.setBuyer((Buyer) user);
		ret.setBuyer((Buyer) returnUser(BuyerDB.convertBuyersToUsers()));
		return ret;
	}

}
